import java.util.Scanner;

public class CountingWhile 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println( "This is a message, and I will display it five times." );
		System.out.print( "Message: " );
		String message = input.nextLine();
		
		input.close();
		
		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n + 1) + ". " + message );
			n++;
		}
		
	}
	
}
