import java.util.Random;

public class DoubleDice {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int roll1, roll2;
		
		do
		{
			roll1 = 1 + random.nextInt(5);
			roll2 = 1 + random.nextInt(5);
			
			System.out.println( "Roll #1: " + roll1 );
			System.out.println( "Roll #2: " + roll2 );
			System.out.println( "The total is " + (roll1 + roll2) + "." );
			System.out.println();
		} while ( roll1 != roll2 );
		
	}
	
}
