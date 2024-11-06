import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }

    static class MaximumAttemptsExceededException extends Exception {
        public MaximumAttemptsExceededException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("\n" + "=================" );
                System.out.println("Attempt: " + i);
                System.out.println("Enter your your username:");
                String username = scanner.next();
                System.out.println("Enter your password:");
                String password = scanner.next();
                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    if (i == 5) {
                        throw new MaximumAttemptsExceededException("Maximum attempts exceeded");
                    } else {
                        throw new InvalidCredentialsException("Invalid credentials");
                    }
                }
                System.out.println("Welcome, " + username);
                break;


            } catch (InvalidCredentialsException e) {

                System.out.println(e.getMessage());


            } catch (MaximumAttemptsExceededException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        scanner.close();

    }
}