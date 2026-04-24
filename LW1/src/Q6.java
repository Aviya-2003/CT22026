import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Width: ");
        int w= input.nextInt();

        System.out.print("Enter Your Height: ");
        int h= input.nextInt();

        JFrame frame = new JFrame();
        frame.setSize(w,h);
        frame.setVisible(true);
        frame.setTitle("user window");





    }
}
