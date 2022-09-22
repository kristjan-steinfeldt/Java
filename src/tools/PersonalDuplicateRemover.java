package tools;


import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    Set<String> Duplicates;
    int duplicateAmount;
    public PersonalDuplicateRemover(){
        this.Duplicates=new HashSet<String>();
        this.duplicateAmount=0;
    }

    @Override
    public void addString(String characterString) {
        if (this.Duplicates.add(characterString)){

        }
        else {
            this.duplicateAmount++;
        }
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.Duplicates;
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateAmount;
    }

    @Override
    public void empty() {
        this.Duplicates.clear();
        this.duplicateAmount=0;
    }
}

