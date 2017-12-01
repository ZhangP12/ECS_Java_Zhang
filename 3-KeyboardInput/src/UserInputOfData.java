import java.util.Scanner;

public class UserInputOfData {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentID;
		double GPA;
		
		System.out.println("Please input the following information.");
		
		System.out.print("First name: ");
		firstName = input.nextLine();
		
		System.out.print("Last name: ");
		lastName = input.nextLine();
		
		System.out.print("Grade (9-12): ");
		grade = input.nextInt();
		
		System.out.print("Student ID: ");
		studentID = input.nextInt();
		
		System.out.print("Login: ");
		login = input.nextLine();
		
		System.out.print("GPA (0.0-4.0): ");
		GPA = input.nextDouble();
		
		System.out.printf("\n \nHere is your information: \n");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Grade (9-12): " + grade);
		System.out.println("Student ID: " + studentID);
		System.out.println("Login: " + login);
		System.out.println("GPA (0.0-4.0): " + GPA);
		
	}
	
}
