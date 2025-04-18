import java.util.Scanner;
public class Login {
	
	public static Login loginAttempt = new Login();
	
	String loginCaution = "You don't have an account yet!. Please go back.";
	
	String username;
	String password;
	
	public boolean AccountCheck() {
		if (User.key.getUsername() == null || User.key.getPassword() == null){
			System.out.println(loginCaution);
			return false;
			}
		return true;
	}
	
	public Login() {
    }

	
	Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Login LogIn() {
		 Scanner input = Global.input;
	       
		   	System.out.print("Username: ");
	        String inputUser = input.nextLine();

	        System.out.print("Password: ");
	        String inputPass = input.nextLine();

	        return new Login(inputUser, inputPass);
		}
	
	public boolean LogInCheck() {
		Login attempt = this.LogIn();
		
		User first = UserDatabase.index.firstLogin();
		
		if ((first.getUsername().equals(attempt.username)) && (first.getPassword().equals(attempt.password))) {
			
			System.out.printf("Welcome home, %s!\n", attempt.username);
			return true;
		} else {
			
			System.out.println("Username or Password is incorrect, please try again");
			
			return false;
		}
		
		
	}
	}

