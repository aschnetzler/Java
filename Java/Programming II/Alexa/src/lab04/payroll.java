package lab04;

public class payroll {
	// Attributes
	private String employeeName;
	private String idNumber;
	private double payRate;
	private double hoursWorked;

	// Gets and Sets
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getGrossPay() {
		return (this.hoursWorked * this.payRate);
	}

	// Constructors
	public payroll(String employeeName, String idNumber, double payRate, double hoursWorked) {
		super();
		this.employeeName = employeeName;
		this.idNumber = idNumber;
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
	}

	public payroll() {
		super();
	}

}
