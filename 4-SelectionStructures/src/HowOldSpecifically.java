import java.util.Scanner;

public class HowOldSpecifically {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println( "Please input your name: " );
		name = input.nextLine();
		
		System.out.println( name + ", please input your age: " );
		age = input.nextInt();
		
		if ( age < 16 ) {
			System.out.println( name + ", you cannot drive." );
		} else if ( age >= 16 && age <= 17 ) {
			System.out.println( name + ", you can drive but not vote. ");
		} else if ( age >= 18 && age <= 24 ) {
			System.out.println( name + ", you can vote but not rent a car. " );
		} else {
			System.out.println( name + ", you can do anything lawful." );
		}
		
	}
	
}