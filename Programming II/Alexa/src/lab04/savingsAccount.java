package lab04;

public class savingsAccount {
	// Attributes
	private double annualInterestRate;
	private double monthlyInterestRate;
	private double balance;
	private double withdrawl;
	private double deposit;
	private double totalWithdrawls;
	private double totalDeposits;
	private int month;
	private double totalMonthInt;

	// Gets and Sets

	public double getmonthbal() {
		return this.balance = (this.balance * this.monthlyInterestRate) + this.balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate = this.annualInterestRate / 12;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getWithdrawl() {
		return balance = (this.balance - this.withdrawl);
	}

	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}

	public double getDeposit() {
		return this.balance = (this.balance + this.deposit);
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;

	}

	public double getTotalWithdrawls() {
		return this.totalWithdrawls += this.withdrawl;
	}

	public double getTotalDeposits() {
		return this.totalDeposits += this.deposit;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getTotalMonthInt() {
		return this.totalMonthInt += this.monthlyInterestRate;
	}

	// Constructors
	public savingsAccount() {
		super();
	}

	@Override
	public String toString() {
		return " Your savings account balance is" + balance + "\n" + "Your total withdrawls are" + totalWithdrawls
				+ "\n" + "Your total deposits are" + totalDeposits + "\n" + "Your total montly interest is"
				+ totalMonthInt + "]";
	}

	public savingsAccount(double balance, double annualInterestRate, double monthlyInterestRate, double withdrawl,
			double deposit, double totalWithdrawls, double totalDeposits, int month) {
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.monthlyInterestRate = monthlyInterestRate;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.totalWithdrawls = totalWithdrawls;
		this.totalDeposits = totalDeposits;
		this.month = month;
	}

}
