import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num of rows for the pyramid: ");
        int rows = input.nextInt();

        System.out.println();

        for(int i =1; i<=rows; i++){
            for(int space =rows-i; space>0; space--){
                System.out.print(" ");
            }

            for(int star=1; star<=(2*i-1); star++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
