import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter String with one Exclamation mark : ");
        String text = input.nextLine();

        int index=text.indexOf('!');
        String partone=text.substring(0,index);
        String parttwo=text.substring(index+1);
        System.out.println(partone);
        System.out.println(parttwo);

    }
}
