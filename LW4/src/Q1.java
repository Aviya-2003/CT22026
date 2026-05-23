import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in celsius : ");
        double temp = input.nextDouble();

        Temperature t = new Temperature(temp);

        System.out.println("Temperature in Fahrenheit is :  " + t.toFahrenheit(temp) + " F");



    }
}
