import java.util.Scanner;

public class CountingFor
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Enter a message, and I'll print it out five times." );
		System.out.print( "Message: ");
		String message = input.nextLine();
		
		for ( int i = 1; i <= 5; i++ )
		{
			System.out.println( i + ". " + message );
		}
		
		
	}
	
}
