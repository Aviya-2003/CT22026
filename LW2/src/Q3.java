import java.util.Scanner;

public class Q3
{
	public static void main(String[] args)
	{
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter temperature in celsius: ");
        int celsius=input.nextInt();

        double temperature=(celsius*1.8)+32;
        System.out.println(" The temperature in fahrenheit is "+temperature );


    }
}
