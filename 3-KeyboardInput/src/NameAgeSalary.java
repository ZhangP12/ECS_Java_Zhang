import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		long age;
		double salary;
		
		System.out.println( "Please input your name: " );
		name = input.nextLine();
		
		System.out.println( "Welcome " + name + ". Please input your age: " );
		age = input.nextLong();
		
		System.out.println("So your name is " + name + " and you are " + age + " years old. " + "Please input your salary (in dollars): ");
		salary = input.nextDouble();
		
		System.out.println("So your salary is $" + salary + ". Thanks for giving your personal information!");
		
	}
	
}
