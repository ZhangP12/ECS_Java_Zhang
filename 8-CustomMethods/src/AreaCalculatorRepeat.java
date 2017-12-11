import java.util.Scanner;

public class AreaCalculatorRepeat
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		int userShape;
		
		System.out.println( "AREA OF SHAPES CALCULATOR\n" );
		
		do
		{	
			System.out.println( "1.) Triangle" );
			System.out.println( "2.) Rectangle" );
			System.out.println( "3.) Square" );
			System.out.println( "4.) Circle" );
			System.out.println( "5.) Quit" );
			System.out.println( "Select a shape to calculate the area of by entering one of the above numbers, or enter 5 to quit: ");
			userShape = input.nextInt();
			
			switch ( userShape )
			{
				case 1:
					System.out.println( "Area of triangle is " + calcTriangleArea() + "." );
					break;
				case 2:
					System.out.println( "Area of rectangle is " + calcRectangleArea()  + "." );
					break;
				case 3:
					System.out.println( "Area of square is " + calcSquareArea() + "." );
					break;
				case 4:
					System.out.println( "Area of circle is " + calcCircleArea() + "." );
					break;
				case 5:
					break;
				default:
					System.out.println( "\nPlease enter a number from 1 to 5." );
					break;
			}
			
		} while ( userShape != 5 );
		
		System.out.println( "You quit the program." );
		
		input.close();
		
	}
	
	public static double calcTriangleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double base, height, triangleArea;
		
		System.out.println( "\nYou have selected triangle." );
		
		System.out.print( "Please enter the base: ");
		base = input.nextDouble();
		
		System.out.print( "Please enter the height: ");
		height = input.nextDouble();
		
		triangleArea = height * base / 2;
		
		return triangleArea;
		
	}
	
	public static double calcRectangleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double base, height, rectangleArea;
		
		System.out.println( "\nYou have selected rectangle.");
		
		System.out.print( "Please enter the base: ");
		base = input.nextDouble();
		
		System.out.print( "Please enter the height: ");
		height = input.nextDouble();
		
		rectangleArea = height * base;
		
		return rectangleArea;
		
	}
	
	public static double calcSquareArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double length, squareArea;
		
		System.out.println( "\nYou have selected square." );
		
		System.out.print( "Please enter the length: " );
		length = input.nextDouble();
		
		squareArea = Math.pow( length, 2 );
		
		return squareArea;
		
	}
	
	public static double calcCircleArea()
	{
		
		Scanner input = new Scanner(System.in);
		
		double radius, circleArea;
		
		System.out.println( "\nYou have selected circle." );
		
		System.out.print( "Please enter the radius: ");
		radius = input.nextDouble();
		
		circleArea = Math.PI * Math.pow( radius, 2 );
		
		return circleArea;
		
	}
	
}
