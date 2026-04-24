import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First name : ");
        String firstName = scanner.next();



        System.out.println("Enter Your Last name : ");
        String lastName = scanner.next();

        String fullname = firstName+" "+lastName;

        JFrame myWindow = new JFrame();

        myWindow.setSize(800, 600);
        myWindow.setTitle(fullname);
        myWindow.setVisible(true);

    }

}
