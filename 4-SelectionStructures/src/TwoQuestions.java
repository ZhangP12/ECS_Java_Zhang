import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String input1, input2, guess = null;
		
		System.out.println( "Think of an object, and I will try to guess what it is by asking you two questions.\n" );
		
		System.out.println( "Is it an animal, vegetable, or mineral?" );
		input1 = input.nextLine();
		
		System.out.println( "Is it bigger than a breadbox?" );
		input2 = input.nextLine();
		
		input.close();
		
		if ( input2.equals("yes") ) {
			if ( input1.equals("animal") ) {
				guess = "squirrel";
			} else if ( input1.equals("vegetable") ) {
				guess = "carrot";
			} else if ( input1.equals("mineral") ) {
				guess = "paperclip";
			}
		} else if ( input2.equals("no") ) {
			if ( input1.equals("animal") ) {
				guess = "moose";
			} else if ( input1.equals("vegetable") ) {
				guess = "watermelon";
			} else if ( input1.equals("mineral") ) {
				guess = "Camaro";
			}
		}
		
		System.out.println( "Is it a " + guess + "?" );
		
	}
	
}
