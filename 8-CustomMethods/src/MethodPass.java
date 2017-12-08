import java.util.Scanner;

public class MethodPass
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Please enter a number: ");
		int userNum = input.nextInt();
		
		input.close();
		
		if ( divBy3(userNum) )
		{
			System.out.println( "Nice number. ");
		}
		else
		{
			System.out.println( "Ew." );
		}
		
	}
	
	public static boolean divBy3(int checkNum)
	{
		return ( checkNum % 3 == 0 ) ? true : false;
	}
	
}
