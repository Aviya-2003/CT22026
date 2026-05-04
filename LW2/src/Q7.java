import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter your Weight in kilograms : ");
        int Weight = input.nextInt();
        System.out.print("Enter your height in Centimeters : ");
        int height = input.nextInt();


        double BMI = Weight / Math.pow((height/100.0),2);

        System.out.println("Your BMI is "+BMI);
        if(BMI>=20 && BMI<=25){
            System.out.println("BMI States : Normal ");
        }
        else {
            System.out.println("BMI States : Not Normal ");
        }
    }


}
