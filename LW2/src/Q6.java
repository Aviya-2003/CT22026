import java.time.LocalDate;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the yearyou born : ");
        int y=input.nextInt();

        int year= LocalDate.now().getYear();
        int age = year-y;

        System.out.println("You were born in "+y+" and will be (are) "+age+" this year");
    }
}
