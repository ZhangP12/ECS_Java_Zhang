import java.util.Scanner;

public class FindingPrimes
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		long lowEnd, highEnd;
		
		System.out.print( "Low endpoint: " );
		lowEnd = input.nextLong();
		System.out.print( "High endpoint: " );
		highEnd = input.nextLong();
		
		input.close();
		
		for ( long i = lowEnd; i <= highEnd; i++ )
		{
			
			if ( basicPrimalityTest(i) ){
				System.out.println( i );
			}
			
		}
		
		System.out.println( "Program finished." );
		
	}
	
	public static boolean basicPrimalityTest( long testPrimality )
	{
		
		for ( long i = 2; i <= (long) Math.sqrt(testPrimality); i++ )
		{
			
			if ( testPrimality % i == 0 )
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
}
