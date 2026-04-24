import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("HH.mm.ss a");


        JFrame time=new JFrame();
        time.setTitle(now.format(format));
        time.setSize(600,600);
        time.setVisible(true);
        time.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
