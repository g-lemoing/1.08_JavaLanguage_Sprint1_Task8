package nivell2.exercici1.java.com.main;

import nivell2.exercici1.java.com.modules.ListOperations;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[] {"Ana", "Alba", "Gwenael", "Jeroni", "Robert", "Joe"};
        List<String> names = Arrays.asList(arr);
        System.out.println("Creem una llista de noms propis: " + names);
        System.out.println("Filtrem els noms de 3 lletres que comencen per una A majúscula: " +
                ListOperations.filteredList(names));
    }
}
