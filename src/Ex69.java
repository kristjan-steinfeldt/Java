import java.util.Scanner;

public class Ex69 {

    public static boolean palindrome(String text) {
        // write your code here
        if (reverse(text)==text){
            return true;
        }
        else {
            return false;
        }
    }

    private static String reverse(String text) {
        String reversed="";
        char character = word.charAt(word.length());

        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }


}
