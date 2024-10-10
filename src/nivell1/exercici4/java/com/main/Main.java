package nivell1.exercici4.java.com.main;

import nivell1.exercici4.java.com.modules.Month;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] months_arr = new String[]{"Gener", "Febrer", "Març", "Abril", "Maig",
                "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
        List<String> months = Arrays.asList(months_arr);
        System.out.println("Creem una llista amb tots els mesos de l'any i els llistem un a un:");
        Month.listMonth(months);
    }
}
