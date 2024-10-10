package nivell1.exercici1.java.com.main;

import nivell1.exercici1.java.com.modules.Methods;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String LETTER = "o";
        System.out.println("Creem una llista de cadenes d'animals:");
        String[] arr_words = new String[] {"gos", "gat", "ostra", "elefant", "ornitorrinc"};
        List<String> words = Arrays.asList(arr_words);
        System.out.println(words);
        System.out.println("Si filtrem les cadenes que tenen una 'o', obtenim la llista següent:\n"
                + Methods.wordsWith(LETTER, words));
    }
}
