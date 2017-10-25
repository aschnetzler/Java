package practice;
import java.util.Scanner;
public class conversions {
	
public static void menu(double meter){	
	int choice;
	
	Scanner keyboard= new Scanner(System.in);
	System.out.print("What is the distance in meters");
	meter = keyboard.nextDouble();
	keyboard.close();
	
	System.out.print("Enter your choice : ");
	choice = keyboard.nextInt();
	switch(choice){
	case 1: showKilometer(meter);
	break;
	case 2: showInches(meter);
	break;
	case 3: showFeet(meter);
	break;
	case 4: closeProgram();
	break;	
}
}
public static void showKilometer(double meter){
	double kilometer;
	kilometer= meter * 0.001;
	System.out.print("The distance in kilometers is," + kilometer);
}
public static void showInches(double meter){
	double inches;
	inches = meter* 39.37;
	System.out.print("The distance in inches is," + inches);
}
public static void showFeet(double meter){
	double feet;
	feet = meter * 3.281;
	System.out.print("The distance in feet is," + feet);
}
public static void closeProgram(){
	System.out.print("Bye!");
}
}
