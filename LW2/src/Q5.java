import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println(" Enter temperature in Fahrenheit: ");
        double fahrenheit=input.nextDouble();

        double temperature=(5.0/9.0) * (fahrenheit-32);
        System.out.println(" The Temperature in Celsius is "+temperature );

    }
}
