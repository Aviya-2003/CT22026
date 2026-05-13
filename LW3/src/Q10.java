import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter  a Word or Pharse : ");
        String word = input.nextLine();

        String rearrange = word.replaceAll("\\s+","").toLowerCase();
        String reversed = "";
        for (int i = rearrange.length()-1; i >= 0; i--) {
            reversed += rearrange.charAt(i);
        }

        if(rearrange.equals(reversed)){
            System.out.println(" It is a Palindrome.");
        }
        else{
            System.out.println(" It is not a Palindrome.");
        }



    }
}
