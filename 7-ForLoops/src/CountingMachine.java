import java.util.Scanner;

public class CountingMachine
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		int userNum = input.nextInt();
		
		for ( int i = 0; i <= userNum; i++ )
		{
			System.out.print( i + " " );
		}
		
	}
	
}
