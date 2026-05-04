import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Invest : ");
        int invest = input.nextInt();
        System.out.println("Enter the Percent interest rate : ");
        double rate = input.nextDouble();
        System.out.println("Enter the Years : ");
        int year = input.nextInt();

        double InvesmentGrowth= invest*Math.pow((1+rate/100.0),year);
        System.out.println("The Investment Growth is "+InvesmentGrowth);

    }
}
