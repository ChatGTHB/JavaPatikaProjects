package _34_BoxingMatch;

import java.util.Random;

public class Match {
    Boxer boxer1;
    Boxer boxer2;
    int minWeight;
    int maxWeight;

    public Match(Boxer boxer1, Boxer boxer2, int minWeight, int maxWeight) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            Random random = new Random();
            boolean isFirstBoxerStarts = random.nextBoolean();

            Boxer firstBoxer;
            Boxer secondBoxer;

            if (isFirstBoxerStarts) {
                firstBoxer = this.boxer1;
                secondBoxer = this.boxer2;
            } else {
                firstBoxer = this.boxer2;
                secondBoxer = this.boxer1;
            }

            while (firstBoxer.health > 0 && secondBoxer.health > 0) {
                System.out.println("=====New Round=====");

                secondBoxer.health = firstBoxer.hit(secondBoxer);
                if (isWin()) {
                    break;
                }
                firstBoxer.health = secondBoxer.hit(firstBoxer);
                if (isWin()) {
                    break;
                }
                System.out.println("Boxer1's Health = " + this.boxer1.health);
                System.out.println("Boxer2's Health = " + this.boxer2.health + "\n");
            }
        } else {
            System.out.println("Boxers' weights don't match!");
        }
    }

    public boolean isCheck() {
        return ((this.boxer1.weight >= minWeight && this.boxer1.weight <= maxWeight) && (this.boxer2.weight >= minWeight && this.boxer2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.boxer1.health == 0) {
            System.out.println(this.boxer2.name + " won !");
            return true;
        }

        if (this.boxer2.health == 0) {
            System.out.println(this.boxer1.name + " won !");
            return true;
        }
        return false;
    }
}
