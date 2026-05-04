import java.util.Scanner;

public class Q1_c {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value X : ");
        int x = input.nextInt();
        System.out.print("Enter the value Y : ");
        int y = input.nextInt();

        double Cube= Math.cbrt(x*y);
        System.out.println("The Cube is : "+Cube);


    }
}
