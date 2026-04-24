import java.security.PublicKey;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the First name : ");
        String Fname = input.next();

        System.out.println("Enter the middle name : ");
        String Mname = input.next();

        System.out.println("Enter the Last name : ");
        String Lname = input.next();

        System.out.println("Your Name Is : "+Lname+","+Fname+" "+Mname.charAt(0)+".");
    }
}
