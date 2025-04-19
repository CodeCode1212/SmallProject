import java.util.Scanner;

public class firstLogin implements loginStrategy {

    private final Login login;
    private final Scanner input;

    // Constructor with dependencies (Login + Scanner)
    public firstLogin(Login login, Scanner input) {
        this.login = login;
        this.input = input;
    }

    @Override
    public boolean handleLogin() {
        if (!login.accountCheck()) return false;

        System.out.println("Please enter your username and password:");
        boolean success = login.loginCheck();

        if (success) {
            PostLoginMainScreen screen = new PostLoginMainScreen(input); // Correct way to instantiate
            screen.show(); // Proceed to the main screen
        }
        return success;
    }
}
