import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double R_inner,R_outer;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radious of Inner circle : ");
        R_inner = input.nextDouble();

        System.out.println("Enter the radious of Outer circle : ");
        R_outer = input.nextDouble();

        Circle Inner = new Circle(R_inner);
        Circle Outer = new Circle(R_outer);



        double area =   Outer.computeArea() - Inner.computeArea();

        System.out.println("The area of the circular region :  " + area + " F");



    }
}
