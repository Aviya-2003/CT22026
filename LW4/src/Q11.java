import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreatNum = random.nextInt(100)+ 1;
        System.out.println();
        System.out.println("===   Number Guessing   ===");
        System.out.println();
    System.out.println(" I've pick a Number between 1 and 100, can you guess it ?\n");


    while(true){
        System.out.println("Enter Your Guess : ");
        int guess = sc.nextInt();


        if(guess<secreatNum){
            System.out.println(" Too Low! Try HIGHER...");
        }
        else if(guess>secreatNum){
            System.out.println(" Too High! Try LOWER...");
        }
        else
            {
            System.out.println(" You Guessed Correctly!");
            break;
            }



    }



    }
}
