
public class EvennessMethod
{

	public static void main(String[] args)
	{
		
		for ( int i = 1; i <= 100; i++ )
		{
			System.out.print( i );
			System.out.print( ( isEven(i) ) ? "<" : "" );
			System.out.print( ( isDivBy3(i) ) ? "=" : "" );
			System.out.println();
		}
		
	}
	
	public static boolean isEven(int checkNum)
	{
		
		return ( checkNum % 2 == 0 ) ? true : false; 
		
	}
	
	public static boolean isDivBy3(int checkNum)
	{
		
		return ( checkNum % 3 == 0 ) ? true : false;
		
	}
	
}
