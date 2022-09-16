import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class W9Ex21 {


    public static class Printer {
        private String fileToread;

        public Printer(String fileName) throws Exception {
           this.fileToread=fileName;
        }
            public void printLinesWhichContain(String line) throws FileNotFoundException {
                File f = new File(this.fileToread);
                Scanner reader = new Scanner(f, "UTF-8");
                while (reader.hasNextLine()) {
                    String Fileline = reader.nextLine();
                    if (Fileline.contains(line)){
                        System.out.println(Fileline);
                    }

                }
                reader.close();
            }
        // ...
    }

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
