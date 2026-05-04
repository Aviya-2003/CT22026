import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enteryour Body Weight: ");
        double bodyWeight=input.nextDouble();

        double calories= bodyWeight*19;
        System.out.println("You needs "+calories+"  Calories per day .");
    }
}
