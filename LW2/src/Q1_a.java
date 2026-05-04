import java.util.Scanner;

public class Q1_a {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value A : ");
        int A = input.nextInt();
        System.out.println("Enter value B : ");
        int B = input.nextInt();
        System.out.println("Enter value C : ");
        int C = input.nextInt();

         double answer=Math.sqrt(Math.pow(B,2)+4*A*C);
        System.out.println("The answer is : "+answer);
    }
}
