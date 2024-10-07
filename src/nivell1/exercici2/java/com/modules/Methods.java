package nivell1.exercici1.java.com.modules;

import java.util.List;

public class Methods {
    public static List<String> wordsWith (String letter, List<String> words){
        return words.stream().filter(w -> w.contains(letter)).toList();
    }
}
