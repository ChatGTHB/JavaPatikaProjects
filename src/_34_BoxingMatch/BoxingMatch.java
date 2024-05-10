package _34_BoxingMatch;

public class BoxingMatch {

    public static void main(String[] args) {

        Boxer boxer1 = new Boxer("Mike Tyson", 20, 120, 100, 30);
        Boxer boxer2 = new Boxer("Muhammed Ali", 20, 120, 100, 30);

        Match match = new Match(boxer1, boxer2, 85, 100);
        match.run();
    }
}
