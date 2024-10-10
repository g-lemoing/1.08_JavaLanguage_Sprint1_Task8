package nivell1.exercici7.java.com.main;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Object[]{"apple", 5.1, "pear", "eggplant", 3.1415, 23, "rapsberry"};
        List<Object> list = Arrays.asList(arr);
        System.out.println("Creem una llista de cadenes de text i nombres: " + list);

        List<String> cadenes = new java.util.ArrayList<>(list.stream()
                .filter(elem -> elem instanceof String)
                .map(elem -> (String) elem)
                .sorted((elem1, elem2)-> elem2.length() - elem1.length())
                .toList());
        System.out.println("Retornem una llista ordenada de cadena més llarga a més curta: " + cadenes);

    }
}
