import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";
        Exception invalid = new Exception("Invalid credentials");
        Exception maximum = new Exception("Maximum attempts exceeded");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Attempt: " + i);
                System.out.println("Enter your your username:");
                String username = scanner.next();
                System.out.println("Enter your password:");
                String password = scanner.next();
                if (i == 5){
                    throw maximum;
                }
                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    throw invalid;
                }
                System.out.println("welcome " + username);
                break;

            } catch (Exception e) {
                if (e == invalid){
                    System.out.println("Invalid credentials");
                }
                if (e == maximum){
                    System.out.println("Maximum attempts exceeded");
                    break;
                }
            }
        }
        scanner.close();

    }
}