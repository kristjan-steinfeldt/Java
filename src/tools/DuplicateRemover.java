package tools;

import java.util.Set;

public interface DuplicateRemover{
    void addString(String characterString);
    int getNumberOfDetectedDuplicates();
    Set<String> getUniqueCharacterStrings();
    void empty();
}