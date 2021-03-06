import java.util.Scanner;

public class BMICalcBetter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double heightFeet, heightInches, pounds, height;
		
		System.out.println( "What is your height in feet? (Inches will be queried later)." );
		heightFeet = input.nextDouble();
		
		System.out.println( "What is your height in inches?" );
		heightInches = input.nextDouble();
		
		System.out.println( "What is your weight in pounds?" );
		pounds = input.nextDouble();
		
		input.close();
		
		double BMI = ( pounds * 0.4536 ) / Math.pow( heightFeet * 0.3048 + heightInches * 0.0254, 2 );
		
		System.out.println( "Your BMI is " + BMI + " kg/m." );
		
		if ( BMI < 18.5 ) {
			System.out.println( "Category: Underweight");
		} else if ( BMI >= 18.5 && BMI <= 24.9 ) {
			System.out.println( "Category: Normal Weight");
		} else if ( BMI >= 25 && BMI <= 29.9 ) {
			System.out.println( "Category: Overweight");
		} else {
			System.out.println( "Category: Obese");
		}
		
	}
	
}
