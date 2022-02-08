import java.util.Date;
import java.lang.Math;
public class Loan{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	public Loan(){
		annualInterestRate=2.5;
		numberOfYears=1;
		loanAmount=1000;
		loanDate= new Date();
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = loanDate;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public Date getLoanDate() {
		return loanDate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate=(annualInterestRate/100)/12;
		double part1 = loanAmount*monthlyInterestRate;
		double part2 = 1/Math.pow((1+monthlyInterestRate),(numberOfYears*12));
		return (part1)/(1-part2);
	}
	
	public double getTotalPayment() {
		return getMonthlyPayment()*getNumberOfYears()*12;
	}
}

