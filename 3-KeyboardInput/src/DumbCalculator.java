import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("AVERAGE CALCULATOR (3 NUMBERS)");
		
		System.out.print( "First number: " );
		num1 = input.nextDouble();
		
		System.out.print( "Second number: " );
		num2 = input.nextDouble();
		
		System.out.print( "Third number: " );
		num3 = input.nextDouble();
		
		System.out.println( "The average of {" + num1 + ", " + num2 + ", " + num3 + "} is: " + ( (num1 + num2 + num3) / 3) +  ".");
		
		
	}
	
}
