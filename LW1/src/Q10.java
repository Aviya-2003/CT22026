import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Odd length  string : ");
        String word = input.nextLine();

        while(word.length()%2==0){

            System.out.println("The String isnt Odd lenghth ...!");
            System.out.println("Enter a string : ");
            word = input.nextLine();
        }
        int index=word.length()/2;
        System.out.println(word.charAt(index));

    }
}
