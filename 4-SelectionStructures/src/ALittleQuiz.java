import java.util.Scanner;

public class ALittleQuiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String answer1, answer2, answer3;
		int numCorrect = 0;
		
		System.out.println( "1.) What is the atomic number of carbon?" );
		answer1 = input.next();
		System.out.println( answer1.equals("6") ? "Correct!" : "Nope, the answer is 6."  );
		numCorrect += ( answer1.equals("6") ) ? 1 : 0;
		
		System.out.println( "\n2.) What cellular process do plants use to convert light energy to chemical energy?" );
		answer2 = input.next();
		System.out.println( answer2.equals("photosynthesis") ? "Correct!" : "Nope, the answer is photosynthesis."  );
		numCorrect += ( answer2.equals("photosynthesis") ) ? 1 : 0;
		
		System.out.println( "\n3.) What is the largest organ in the human body?" );
		answer3 = input.next();
		System.out.println( answer3.equals("skin") ? "Correct!" : "Nope, the answer is skin."  );
		numCorrect += ( answer3.equals("skin") ) ? 1 : 0;
		
		System.out.println( "\nYou got " + numCorrect + " correct." );
		
		
	}
	
}
