import java.util.Scanner;

public class Q1 {

    public static void main(String [] args) {
        Scanner input = new Scanner (System.in );
        System.out.println(" input integer One : ");
        int x = input.nextInt();
        System.out.println(" input integer Two : ");
        int y = input.nextInt();
        System.out.println(" input integer Three : ");
        int z = input.nextInt();
        int  smallest = x;

            if(y<smallest){
           smallest=y;
        }
            if(z<smallest){
                smallest=z;
            }

        System.out.println(" The smallest number is : "+smallest);

    }
}
