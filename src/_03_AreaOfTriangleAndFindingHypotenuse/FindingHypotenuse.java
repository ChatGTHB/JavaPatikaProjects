import java.util.Scanner;
public class FindingHypotenuse {
    public static void main(String[] args) {

        int verticalEdge1, verticalEdge2;
        double hypotenuse;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first vertical edge : ");
        verticalEdge1=input.nextInt();

        System.out.print("Enter the second vertical edge : ");
        verticalEdge2=input.nextInt();

        hypotenuse=Math.sqrt(Math.pow(verticalEdge1,2)+Math.pow(verticalEdge2,2));
        System.out.println("Hypotenuse = " + hypotenuse);
    }
}
