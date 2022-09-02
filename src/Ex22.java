import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        /*In this exercise we create a program that asks the user for a password. If the password is right, a secret message is shown to the user.**/

            String password = "carrot";
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter Your Password: ");
            String userPass = reader.next(); // Scans the next token of the input as an int.
            if (userPass.equals(password)) {
                System.out.println("Password correct");
                System.out.println("Super secret");

            } else {
                System.out.println("Wrong password");

            }

        }
}
