import javax.swing.plaf.synth.SynthSeparatorUI;

public class MoreVariablesAndPrinting {

	public static void main(String[] args) {
		
		String myName, myEyes, myTeeth, myHair; 
		int myAge, myHeight, myWeight; 
		myName = "Paul zhang"; 
		myAge = 14; // not a lie 
		myHeight = 100; // inches 
		myWeight = 100; // lbs 
		myEyes = "Brown";
		myTeeth = "Black";
		myHair = "Black"; 
		
		System.out.println( "Let's talk about " + myName + "." ); 
		System.out.println( "He's " + myHeight + " inches (or " + (myHeight * 2.54) + " cm) tall." ); 
		System.out.println( "He's " + myWeight + " pounds (or " + (myWeight * 0.454) + " kg) heavy." );
		System.out.println( "Actually, that's not too heavy." ); 
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." ); 
		System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "." ); 
		
		
		
	}
	
}
