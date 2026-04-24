import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  String: ");
        String txt=input.nextLine();

        int length=txt.length();
        System.out.println(length);
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(length-1));


    }
}
