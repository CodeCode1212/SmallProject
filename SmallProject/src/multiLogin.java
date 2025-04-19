import java.util.Scanner;
public class multiLogin implements loginStrategy {

    private final Scanner input;
    private final UserDatabase userDatabase;

    public multiLogin(Scanner input, UserDatabase userDatabase) {
        this.input = input;
        this.userDatabase = userDatabase;
    }

    @Override
    public boolean handleLogin() {
        int count = userDatabase.getAccountCount();
        System.out.println("Available accounts:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. %s\n", i + 1, userDatabase.getAccount(i).getUsername());
        }

        System.out.print("Select account number: ");
        int selection = input.nextInt();
        input.nextLine(); // consume newline

        if (selection < 1 || selection > count) {
            System.out.println("Invalid selection.");
            return false;
        }

        User selected = userDatabase.getAccount(selection - 1);

        System.out.print("Enter password for " + selected.getUsername() + ": ");
        String password = input.nextLine();

        if (selected.getPassword().equals(password)) {
            System.out.printf("Welcome back, %s!\n", selected.getUsername());
            PostLoginMainScreen screen = new PostLoginMainScreen(input); // ✅ no static object
            screen.show();
            return true;
        } else {
            System.out.println("Incorrect password.");
            return false;
        }
    }
}