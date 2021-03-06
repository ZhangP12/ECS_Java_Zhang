import java.util.Random;
import java.util.Scanner;

public class HiLow
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int tryToGuess = 1 + random.nextInt(99);
		int userGuess, guessNum = 1;
		
		System.out.println( "I have selected a number between 1 and 100. Try to guess it -- you have 10 tries." );
		
		do
		{
			System.out.print( "\nGuess #" + guessNum + ": " );
			userGuess = input.nextInt();
			
			if ( tryToGuess > userGuess )
			{
				System.out.println( "Too low." );
			} 
			else if ( tryToGuess < userGuess )
			{
				System.out.println( "Too high." );
			}
			
			guessNum++;
		} while ( tryToGuess != userGuess && guessNum <= 10 );
		
		if ( tryToGuess == userGuess )
		{
			System.out.println( "\nNice, you guessed correctly!" );
		}
		else
		{
			System.out.println( "\nWups, ran out of tries." );
		}
		
	}
	
}
