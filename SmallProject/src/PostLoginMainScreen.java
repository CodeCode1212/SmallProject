import java.util.Scanner;

public class PostLoginMainScreen {
    private final Scanner input;

    public PostLoginMainScreen(Scanner input) {
        this.input = input;
    }

    public void show() {
        while (true) {
            System.out.println("Exit this account -> Enter 0");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();
                if (choice == 0) {
                    System.out.println("Exiting the account...");
                    Clock.Timer();
                    System.out.println("Done.");
                    return;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input! Please try again.");
                input.next();
            }
        }
    }
}