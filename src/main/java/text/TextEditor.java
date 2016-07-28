package text;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjluoyue on 2016/7/25.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    private String name;
//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker = spellChecker;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // a setter method to inject the dependency.
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
