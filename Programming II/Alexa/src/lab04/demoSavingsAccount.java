package lab04;

import javax.swing.*;

public class demoSavingsAccount {

	public static void main(String[] args) {
		savingsAccount account1 = new savingsAccount();

		// Get Annual Interest Rate
		String rate;
		rate = JOptionPane.showInputDialog("What is annual interest rate?");
		double rate2 = Double.parseDouble(rate);
		account1.setAnnualInterestRate(rate2);

		// Get starting balance
		String balance;
		balance = JOptionPane.showInputDialog("What is the starting balance?");
		double balance2 = Double.parseDouble(balance);
		account1.setBalance(balance2);

		// Get month
		String month;
		month = JOptionPane.showInputDialog("How many months have you had this account");
		int month2 = Integer.valueOf(month);
		account1.setMonth(month2);

		for (int i = 0; i < account1.getMonth(); i++) {

			// Withdrawls
			String withdrawls;
			withdrawls = JOptionPane.showInputDialog("What amount was withdrawn this month?");
			double withdrawls2 = Double.parseDouble(withdrawls);
			account1.setWithdrawl(withdrawls2);

			// Deposits
			String deposit;
			deposit = JOptionPane.showInputDialog("What amount was deposited this month?");
			double deposit2 = Double.parseDouble(deposit);
			account1.setDeposit(deposit2);

			account1.getWithdrawl();
			account1.getDeposit();
			account1.getMonthlyInterestRate();
			account1.getmonthbal();
			account1.getTotalDeposits();
			account1.getTotalWithdrawls();
			account1.getAnnualInterestRate();

		}
		System.out.println(account1);
	}

}
