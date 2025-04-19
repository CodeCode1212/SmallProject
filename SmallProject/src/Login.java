import java.util.Scanner;

public class Login {
    private final Scanner input;
    private final UserDatabase userDatabase;

    public Login(Scanner input, UserDatabase userDatabase) {
        this.input = input;
        this.userDatabase = userDatabase;
    }

    public boolean accountCheck() {
        if (userDatabase.getAccountCount() == 0) {
            System.out.println("You don't have any accounts yet! Please go back.");
            return false;
        }
        return true;
    }

    public boolean loginCheck() {
        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        User matched = userDatabase.findUser(username, password);

        if (matched != null) {
            System.out.printf("Welcome home, %s!\n", matched.getUsername());
            return true;
        } else {
            System.out.println("Username or Password is incorrect. Please try again.");
            return false;
        }
    }
}
