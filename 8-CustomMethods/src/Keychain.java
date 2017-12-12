import java.util.Scanner;

public class Keychain
{

	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner input = new Scanner(System.in);
		
		int userChoice, keychainNum = 0;
		
		System.out.println( "+++++++++++++++++++++++++++++++++" );
		System.out.println( "THE USELESS VIRTUAL KEYCHAIN SHOP" );
		System.out.println( "+++++++++++++++++++++++++++++++++" );
		
		do
		{
			
			System.out.println( "\n1. Add keychains to order." );
			System.out.println( "2. Remove keychains from order." );
			System.out.println( "3. View current order." );
			System.out.println( "4. Go to checkout.\n" );
			
			System.out.print( "Please enter the number of your choice: ");
			userChoice = input.nextInt();
			
			switch ( userChoice )
			{
				case 1:
				{
					keychainNum = addKeychains(keychainNum);
					break;	
				}
				case 2: 
				{
					keychainNum = removeKeychains(keychainNum);
					break;
				}
				case 3: 
				{
					viewCurrentOrder(keychainNum);
					break;
				}
				case 4: 
				{
					checkout(keychainNum);
					break;
				}
				default:
				{
					System.out.println( "\nWups, you entered an invalid number! Only 1-4 are valid." );
				}
				
			}
			
			Thread.sleep(1000);
			
		} while ( userChoice != 4 );
		
		input.close();
		
	}
	
	public static int addKeychains( int keychainNum )
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print( "\nHow many keychains would you like to add to your order? " );
		int add = input.nextInt();
		
		return keychainNum + add;
		
	}
	
	public static int removeKeychains( int keychainNum )
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print( "\nHow many keychains would you like to remove from your order? " );
		int remove = input.nextInt();
		
		return keychainNum - remove;
		
	}
	
	public static void viewCurrentOrder( int keychainNum )
	{
		
		System.out.println( "\nYou currently have " + keychainNum + " in your order." );
		
	}
	
	public static void checkout( int keychainNum )
	{
		
		System.out.println( "\nYou ordered " + keychainNum + " keychains." );
		System.out.println( "One keychain costs $9.99. Tax is 4.7%." );
		System.out.println( "Your subtotal is $" + ( keychainNum * 9.99) + "." );
		System.out.println( "Your final total with tax is $" + ( keychainNum * 9.99 * 1.047 ) + "." );
		System.out.println( "Thanks for shopping at The Useless Virtual Keychain Shop!" );
		
	}
	
}
