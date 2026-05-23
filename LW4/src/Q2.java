import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit : ");
        double temp = input.nextDouble();

        Temperature t = new Temperature();
        t.setFahrenheit(temp);

        System.out.println("The Tempurature  In Celsius is :  " + t.toCelsius()+ " C");

    }
}
