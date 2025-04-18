import java.util.Scanner;
public class PostLoginMainScreen {
	
	String screeN = "Exit this account -> Enter 0";
	
	public static PostLoginMainScreen screen = new PostLoginMainScreen();
	
	public void Screen(Boolean confirm) {
		Scanner action = Global.input;
		while (confirm){
			System.out.println(screeN);
			if (action.hasNextInt()) {
				int choice = action.nextInt();
					switch(choice) {
					
					case 0 -> {
						System.out.println("Exiting the account...");
						Clock.Timer();
						System.out.println("Done.");
						return;
					}
					
					default -> {
						System.out.println("Invalid choice. Please try again.");
					}
					}
			} else {
				System.out.println("Invalid input! Please try again.");
				action.next();
				}
			
			
			
		}
	}
	
}
