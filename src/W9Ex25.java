import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;

public class W9Ex25 {

    public static void main(String[] args) {
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.addString("first");
        remover.addString("second");
        remover.addString("first");

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        remover.addString("last");
        remover.addString("last");
        remover.addString("new");

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
                remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
                remover.getUniqueCharacterStrings());
    }

}
