import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        final double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radious of the sphere: ");
        int radio = input.nextInt();

        double volume =(4.0/3.0) * pi * Math.pow(radio,3);
        System.out.println("The Volume of the sphere is "+volume);

    }
}
