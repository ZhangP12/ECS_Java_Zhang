import java.util.Scanner;

public class BabyCalc
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		String num1, operator, num2;
		
		System.out.println( "Enter a math procedure (e.g. 1 + 1): " );
		
		num1 = input.next();
		operator = input.next();
		num2 = input.next();
		
		System.out.println( "So you want to (" + operator + "): " + num1 + " and " + num2 + "." );
		
		input.close();
		
	}
	
}
