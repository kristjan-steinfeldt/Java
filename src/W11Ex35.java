import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class W11Ex35 {
    public static class Dictionary {
        HashMap<String, String> Dictionary = new HashMap<String, String>();
        String fileName;
        public String translate(String word) {
            return Dictionary.get(word);
        }

        public boolean load() throws FileNotFoundException {
            File file = new File(this.fileName);
            Scanner fileReader = new Scanner(file);
            while ( fileReader.hasNextLine() ){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                this.add(parts[1],parts[0]);
            }
            return true;
        }
        public boolean save(){
           // try {
               // FileWriter myWriter = new FileWriter(this.fileName);
                //for(String key: Dictionary.keySet()){
                  // for(String value: this.Dictionary.get(key)) {
                        // use the value here
                //    }
               // }
                //myWriter.close();
                //System.out.println("Successfully wrote to the file.");
                //return true;
          //  } //catch (IOException e) {
               // System.out.println("An error occurred.");
              //  e.printStackTrace();
                return false;
           // }
        }
        public Dictionary(String file){
            this.fileName=file;
        }
        //adding a new translation to the dictionary
        public void add(String word, String translation) {
            if (Dictionary.containsKey(word) || Dictionary.containsKey(translation)){}
            else {
                Dictionary.put(word, translation);
                Dictionary.put(translation, word);
            }

        }

        public ArrayList<String> translationList() {
            ArrayList<String> Indexer = new ArrayList<>();
            for (String key : Dictionary.keySet()) {
                Indexer.add(key + "=" + Dictionary.get(key));
            }
            return Indexer;
        }
    }

    public static void main(String[] args) throws Exception {
        Dictionary dict = new Dictionary("src/words.txt");
        dict.load();

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("ohjelmointi") );
        System.out.println( dict.translate("alla oleva") );
        System.out.println(dict.Dictionary.keySet());
        //dict.save();
    }
}
