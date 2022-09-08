import java.util.Scanner;
import java.util.Random;

public class Ex41 {
    public static void main(String[] args) {
        Random random = new Random();
// Generates random integers 0 to 49
        int num = random.nextInt(101);
        boolean correct=false;
        int i=0;
        while (correct == false) {
            i++;
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int guess = reader.nextInt();


            if (guess==num){
                correct=true;
                reader.close();

                System.out.println("guesses made:"+i);
                System.out.println("Number was "+num+" Congratulations!");

            }
            else if (guess>num){
                System.out.println("guesses made:"+i);
                System.out.println("Number is Smaller, guess again");
            }
            else if (guess<num){
                System.out.println("guesses made:"+i);
                System.out.println("Number is Bigger, guess again");
            }
        }
    }
}
