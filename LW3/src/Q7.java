import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean value = true;

        while (value) {
            System.out.print("Enter number count to digits: ");
            int num = input.nextInt();
            if (num >= 0) {
                int count = 0;
                while (num != 0) {
                    num = num / 10;
                    count++;

                }
                System.out.println("The digits of the number  is " + count);
            } else {
                value = false;
            }
        }

    }
}