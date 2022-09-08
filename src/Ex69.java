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

    private static CharSequence reverse(String text) {
        String reversed="";
        char character='b';
        int n=text.length()-1;
        while (n>0) {
            character = text.charAt(n);
            reversed=reversed+character;
        }
        return reversed;
    }

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Type a text: ");
        String text = reader.next();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }


}
