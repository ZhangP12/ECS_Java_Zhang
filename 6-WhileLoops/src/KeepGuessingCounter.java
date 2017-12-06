import java.util.Scanner;
import java.util.Random;

public class KeepGuessingCounter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int guess, guessNum = 0;
		int randomNum = 1 + random.nextInt(9);
		
		System.out.println( "I have randomly selected a number from 1-10. Try to guess it!" );
		
		do
		{
			System.out.print( "Guess #" + guessNum + ": ");
			guess = input.nextInt();
			
			guessNum++;
		} while ( guess != randomNum );
		
		input.close();
		System.out.println( "Nice, you guessed it! It took you " + guessNum + " tries." );
		
	}
	
}
