import java.util.Scanner;

public class Q1_b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value X : ");
        int x = input.nextInt();
        System.out.print("Enter the value Y : ");
        int y = input.nextInt();

        double answer=Math.sqrt(x+4*Math.pow(y,3));
        System.out.println("Answer is : "+answer);
    }
}
