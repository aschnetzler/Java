package lab02;

public class LinuxDistroDemo {

	public static void main(String[] args) {

		// Instance 1
		LinuxDistro Debain = new LinuxDistro();
		Debain.setNameOS("Debain");
		Debain.setDeveloper("Debain Project");
		Debain.setYearReleased(1993);
		System.out.println("Name: " + Debain.getNameOS() + "\n" + "Developer: " + Debain.getDeveloper() + "\n"
				+ "Year Released: " + Debain.getYearReleased() + "(" + Debain.getDistroAge() + " years ago)");

		// Instance 2
		LinuxDistro Ubuntu = new LinuxDistro();
		Ubuntu.setNameOS("Ubuntu");
		Ubuntu.setDeveloper("Canonical");
		Ubuntu.setYearReleased(2004);
		System.out.println("\n" + "\n" + "Name: " + Ubuntu.getNameOS() + "\n" + "Developer: " + Ubuntu.getDeveloper()
				+ "\n" + "Year Released: " + Ubuntu.getYearReleased() + "(" + Ubuntu.getDistroAge() + " years ago)");

		// Instance 3
		LinuxDistro Fedora = new LinuxDistro();
		Fedora.setNameOS("Fedora");
		Fedora.setDeveloper("Fedora Project");
		Fedora.setYearReleased(2003);
		System.out.println("\n" + "\n" + "Name: " + Fedora.getNameOS() + "\n" + "Developer: " + Fedora.getDeveloper()
				+ "\n" + "Year Released: " + Fedora.getYearReleased() + "(" + Fedora.getDistroAge() + " years ago)");
	}

}
