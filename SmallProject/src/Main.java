import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserDatabase userDatabase = new UserDatabase();

        while (true) {
            WelcomeScreen screen = (userDatabase.getAccountCount() > 0)
                ? new UpdatedMainScreen()
                : new WelcomeScreen();

            screen.MainScreen();

            if (input.hasNextInt()) {
                int caSe = input.nextInt();
                input.nextLine();

                switch (caSe) {
                case 1 -> {
                    loginStrategy strategy;

                    int accountCount = userDatabase.getAccountCount(); // Use your OOP-compliant reference
                    if (accountCount == 1) {
                        Login login = new Login(input, userDatabase); // Still need userDatabase for verification
                        strategy = new firstLogin(login, input);
                    } else if (accountCount > 1) {
                        strategy = new multiLogin(input, userDatabase);
                    } else {
                        System.out.println("No accounts available. Please register first.");
                        continue;
                    }

                    boolean success = strategy.handleLogin();
                    if (!success) continue;
                }


                    case 2 -> {
                        Register register = new Register(input);
                        User newUser = register.BecomeAMember();
                        userDatabase.storeAccount(newUser);
                    }
                    case 3 -> {
                        System.out.println("Exiting the page...");
                        Clock.Timer();
                        System.out.println("See you again.");
                        input.close();
                        return;
                    }
                    default -> {
                        System.out.println("Invalid choice. Try again.");
                    }
                }
            } else {
                System.out.println("Invalid input! Please try again.");
                input.next();
            }
        }
    }
}
