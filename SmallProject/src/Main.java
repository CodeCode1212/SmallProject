import java.util.Scanner;

public class Main {
	public static boolean lock = false;
	public static void main(String[] args) {
		Scanner input = Global.input;
		
		while (true) {
		WelcomeScreen.screen.MainScreen();			
		if (input.hasNextInt()) {
			int caSe = input.nextInt();
			input.nextLine();
			switch (caSe) {
			
			    case 1 -> {
			    	lock = Login.loginAttempt.AccountCheck();
			    	if (!lock) {
			    		continue;
			    	}
			    	System.out.println("Please enter your username and password:");
			    	
			    	lock = Login.loginAttempt.LogInCheck();
			    	if(!lock) {
			    		continue;
			    	} else {
			    		PostLoginMainScreen.screen.Screen(lock);
			    		
			    	}
			    	continue;
			    }
				case 2 -> {
					Register.registerAccount.BecomeAMember();
					UserDatabase.index.StoreAccounts(User.key);
					WelcomeScreen.screen = new UpdatedMainScreen();
					continue;
				}
				case 3 -> {
					System.out.println("Exiting the page...");
					Clock.Timer();
					System.out.println("See you again.");
					Global.input.close();
					return;
				}
				default -> {
					System.out.println("Invalid choice. Try again.");
				}
			};
		} else {
			System.out.println("Invalid input! Please try again.");
			input.next();
			}
		
		}
		
	}

		
}

