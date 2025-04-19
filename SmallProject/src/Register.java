import java.util.Scanner;

public class Register {
    private final Scanner input;

    public Register(Scanner input) {
        this.input = input;
    }

    public User BecomeAMember() {
        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        System.out.println("Proceeding...");
        Clock.Timer();
        System.out.println("Your account has been successfully created.");

        return new User(username, password);
    }
}