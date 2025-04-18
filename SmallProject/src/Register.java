import java.util.Scanner;
public class Register {
	public static Register registerAccount = new Register();
	public void BecomeAMember () {
		String username, password;
		Scanner input = Global.input;
		
		System.out.print("Please enter your username: \n");
		username = input.nextLine();
		User.key.setUsername(username);
		
		System.out.print("Please enter your password: \n");
		password = input.nextLine();
		User.key.setPassword(password);
		
		System.out.println("Proceeding....");
		Clock.Timer();
		System.out.println("Your account has been successfully created.");
	}
	

}
