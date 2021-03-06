import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double weight;
		String planet;
		boolean correctUserInput = true;
		
		System.out.print( "Please enter your current weight on Earth: " );
		weight = input.nextDouble();
		
		do {
			
			correctUserInput = true;
			
			System.out.printf( "\nChoose from one of these planets: ");
			System.out.printf( "\n%1$-10s %2$-10s %3$-10s \n%4$-10s %5$-10s %6$-10s\n", "1. Venus", "2. Mars", "3. Jupiter", "4. Saturn", "5. Uranus", "6. Neptune" );
			planet = input.next();
		
			if ( planet.equals("Venus") ) {
				System.out.println( "Your weight on Venus is " + (weight * 0.78) + " pounds." );
			} else if ( planet.equals("Mars") ) {
				System.out.println( "Your weight on Mars is " + (weight * 0.39) + " pounds." );
			} else if ( planet.equals("Jupiter") ) {
				System.out.println( "Your weight on Saturn is " + (weight * 2.65) + " pounds." );
			} else if ( planet.equals("Saturn") ) {
				System.out.println( "Your weight on Saturn is " + (weight * 1.17) + " pounds." );
			} else if ( planet.equals("Uranus") ) {
				System.out.println( "Your weight on Uranus is " + (weight * 1.05) + " pounds." );
			} else if ( planet.equals("Neptune") ) {
				System.out.println( "Your weight on Neptune is " + (weight * 1.23) + " pounds." );
			} else {
				System.out.println( "You did not enter a planet's name. Please try again." );
				correctUserInput = false;
			}
			
		} while ( correctUserInput == false );
		
	}
	
}
