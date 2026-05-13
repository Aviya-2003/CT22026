import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the  Sentence : ");
        String sentence = input.nextLine();

        System.out.println(" Enter the Word to Replace : ");
        String word = input.nextLine();

        System.out.println(" Enter the Replacement word : ");
        String replacement = input.nextLine();


        String result= sentence.replaceAll(word, replacement);

        System.out.println("updated sentence : ");
        System.out.println(result);

    }


}

