package lab02;

public class LinuxDistro {
	// Attributes
	private String nameOS;
	private String developer;
	private int yearReleased;

	// GETS and SETS
	public String getNameOS() {
		return nameOS;
	}

	public void setNameOS(String nameOS) {
		this.nameOS = nameOS;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public int getDistroAge() {
		return (2016 - this.yearReleased);
	}
}
