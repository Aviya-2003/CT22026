import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        System.out.println("Enter the valuve need to convert :");
        Scanner input = new Scanner(System.in);
        double centi = input.nextDouble();

        double inches = centi/2.54;
        int  feet = (int)(inches / 12);
        inches = inches %12;

        System.out.println("Your centemeters have been converted to " + feet + " feet and " + inches + " inches.");



    }
}
