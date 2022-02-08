import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 12000.95: ");
		double loanAmount = input.nextDouble();
		
		Date loanDate = new Date();
		Loan l1 = new Loan(annualInterestRate,numberOfYears,loanAmount,loanDate);
		/*
		 * Loan l1 = new Loan();
		 * l1.setAnnualInterestRate(annualInterestRate);
		 * l1.setNumberOfYears(numberOfYears); 
		 * l1.setLoanAmount(loanAmount);
		 * l1.setLoanDate(loanDate);
		 */
		 
		System.out.println("The loan was created on "+l1.getLoanDate());
		System.out.format("The monthly payment is %.2f\n",l1.getMonthlyPayment());
		System.out.format("The total payment is %.2f\n",l1.getTotalPayment());
	}
}
