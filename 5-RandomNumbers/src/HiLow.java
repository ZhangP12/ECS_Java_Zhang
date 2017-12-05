import java.util.*;

public class HiLow {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		final int randomNum = 1 + random.nextInt(99);
		int guess;
		
		System.out.println( "I'm thinking of a number between 1 and 100. Try to guess what it is." );
		guess = input.nextInt();
		
		System.out.println();
		
		if ( guess == randomNum ) {
			System.out.println( "Correct!" );
		} else {
			System.out.println( "Nope, it was " + randomNum + "." );
		}
		
	}
	
}
