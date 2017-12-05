import java.util.Random;

public class Dice {

	private static int RollDice() {
		
		Random random = new Random();
		int randomNum = 1 + random.nextInt(6);
		return randomNum;
		
	}
	
	public static void main(String[] args) {
		
		int roll1 = RollDice();
		int roll2 = RollDice();
		
		System.out.println( "Roll #1: " + roll1 );
		System.out.println( "Roll #2: " + roll2 );
		System.out.println( "The sum is " + ( roll1 + roll2 ) + "." );
		
	}
	
}
