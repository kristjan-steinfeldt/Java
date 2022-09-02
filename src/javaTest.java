import java.util.Scanner;
public class javaTest {
    public static void main(String[] args) {
        /*Create a program that asks the user for a number and tells whether the number is even or odd.**/
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();
        if (n % 2 == 1){
            System.out.println("Number " + n+" is not even");
        }
        else {
            System.out.println("Number "+n+" is even");
        }


    }

}