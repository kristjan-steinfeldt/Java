import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class W7Ex7 {

public static class Dictionary{
    HashMap<String, String> Dictionary = new HashMap<String, String>();
    private int words=0;
    public int amountOfWords(){
        return words;
    }
    public String translate(String word){

        return Dictionary.get(word);
    }


    //adding a new translation to the dictionary
    public void add(String word, String translation){
        Dictionary.put(word, translation);
        words++;
    }
    public ArrayList<String> translationList(){
        ArrayList<String> Indexer = new ArrayList<>();
        for ( String key : Dictionary.keySet() ) {
            Indexer.add(key+"="+ Dictionary.get(key));
        }
    return Indexer;
    }
}
public static class TextUserInterface{
    public Scanner reader;
    public Dictionary dictionary;
 public TextUserInterface(Scanner reader, Dictionary dictionary){
     this.reader=reader;
     this.dictionary=dictionary;
//The text user interface stores into two object variables the reader and dictionary it has received as constructor parameters.
// You don't need other object variables. The user input must be read using the reader object received as constructor parameter!
// The translations also have to be stored into the dicitonary object received as constructor parameter. The text user interface must not create new objects itself!
//

//At the beginning, in the text user interface must only have the command quit, to quit the text user interface. If the user inputs something else, we print "Unknown statement".
 }
    public void start(){
     while (true){
         String input= this.reader.nextLine();
         System.out.println("Statements:");
         System.out.println("add - adds a word pair to the dictionary");
         System.out.println("translate - asks a word and prints its translation");
         System.out.println("quit - quits the text user interface");
         if (input.equals("quit")){
             break;
         }
         else if (input.equals("add")) {
             System.out.println("insert word in english:");
             String ToAdd = this.reader.nextLine();
             System.out.println("insert word in other language:");
             String Translation=this.reader.nextLine();
             this.dictionary.add(ToAdd,Translation);
             //    dictionary.add("banaani", "banana");
         }
         else if (input.equals("translate")) {
            System.out.println("insert word to translate:");
             String toTranslate = this.reader.nextLine();
             System.out.println(this.dictionary.translate(toTranslate));
         }
         else {
             System.out.print("unknown entry");
         }
     }
    }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

  //  Dictionary dictionary = new Dictionary();
        //    dictionary.add("apina", "monkey");
        //    dictionary.add("banaani", "banana");
        //
        //    System.out.println(dictionary.translate("apina"));
        //    System.out.println(dictionary.translate("porkkana"));
        //
        //    System.out.println(dictionary.amountOfWords());
        //
        //    dictionary.add("cembalo", "harpsichord");
        //    System.out.println(dictionary.amountOfWords());
        //
        //        ArrayList<String> translations = dictionary.translationList();
        //        for(String translation: translations) {
        //            System.out.println(translation);
        //}
}}
