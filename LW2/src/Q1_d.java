import java.util.Scanner;

public class Q1_d {
    public static void main(String[] args) {
        final double PI=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radious of the Circle : ");
        double radius = input.nextDouble();
        double area = PI * Math.pow(radius, 2);
        System.out.println("The Area of the Circle is : "+area);
    }
}
