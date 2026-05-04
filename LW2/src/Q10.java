import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        final int Month_In_Year = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Loan Amount : ");
        double loanAmount = input.nextDouble();
        System.out.println("Enter the Loan period : ");
        int year = input.nextInt();
        System.out.println("Enter the Loan Interest Rate : ");
        double loanInterestRate = input.nextDouble();

        double monthlyInterestRate = loanInterestRate /100.0/Month_In_Year;
        double numberOfPayments = year * Month_In_Year;
        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        System.out.printf("The Monthly Payment is :- %.3f\n ",monthlyPayment);
        double totalPayment = numberOfPayments * monthlyPayment;
        System.out.printf("The Total Payment is :- %.3f ",totalPayment);

    }
}
