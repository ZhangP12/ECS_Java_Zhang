import java.util.Scanner;

public class AgeIn5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		long age;
		
		System.out.println( "Hi there! What's your name? (Don't worry we won't sell your information ;D)." );
		name = input.nextLine();
		
		System.out.println( "Hey " + name + ", please give me your age as well. Again, we will definitely not be selling your information." );
		age = input.nextLong();
		
		System.out.println( "Hmm, in case you can't do basic arithmetic, your age in 5 years is " + (age + 5) + " and your age 5 years ago was " + (age - 5) );
		
	}
	
}
