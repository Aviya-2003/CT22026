import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First name : ");
        String firstName = scanner.next();

        System.out.println("Enter Your middle name : ");
        String middleName = scanner.next();

        System.out.println("Enter Your Last name : ");
        String lastName = scanner.next();
        System.out.println(firstName + " " + middleName.substring(0, 1) + " " + lastName);
    }
}

