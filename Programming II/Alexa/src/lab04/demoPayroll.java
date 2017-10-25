package lab04;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class demoPayroll {
	public static void main(String[] args) {
		// Attributes
		payroll employee1 = new payroll();
		DecimalFormat dollar = new DecimalFormat("#,###.00");

		// Get Employee Name
		String name;
		name = JOptionPane.showInputDialog("What is the employee's name?");
		employee1.setEmployeeName(name);

		// Get Id Number
		String number;
		number = JOptionPane.showInputDialog("What is the employee's id number?");
		employee1.setIdNumber(number);

		// Get Pay Rate
		String pay;
		pay = JOptionPane.showInputDialog("What is the employee's pay rate?");
		double pay2 = Double.parseDouble(pay);
		employee1.setPayRate(pay2);

		// Get Hours Worked
		String hours;
		hours = JOptionPane.showInputDialog("How many hours did the employee work?");
		double hours2 = Double.parseDouble(hours);
		employee1.setHoursWorked(hours2);

		System.out.println("Name" + "\t" + "ID" + "\t" + "Pay Rate" + "\t" + "Hours Worked" + "\t" + "Gross Pay");
		System.out.println(employee1.getEmployeeName() + "\t" + employee1.getIdNumber() + "\t" + employee1.getPayRate()
				+ "\t" + "\t" + employee1.getHoursWorked() + "\t" + "\t" + dollar.format(employee1.getGrossPay()));

	}

}
