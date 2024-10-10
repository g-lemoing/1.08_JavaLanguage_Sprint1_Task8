package nivell2.exercici4.java.com.main;

import nivell2.exercici4.java.com.modules.Utilities;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"alegria", "53", "170", "cama", "camell", "zebra", "315", "mandarina"};
        List<String> cadenes = Arrays.asList(arr);
        System.out.println("Creem una llista de cadenes alfabètiques i de nombres: " + cadenes);
        System.out.println("Exercici 1 - Ordenem la llista pel primer caracter: " + Utilities.sortFirstChar(cadenes));
        System.out.println("Exercici 2 - Ordenem la llista per les cadenes que contenen una 'e' primer: "
                + Utilities.sortFirstContains_e(cadenes));
        System.out.println("Exercici 3 - Subsituim les cadenes que contenen una 'a' per un '4': "
                + Utilities.replaceElemWith_a(cadenes));
        System.out.println("Exercici 4 - Filtrem la llista per mostrar només els elements numérics: "
                + Utilities.filterNumbers(cadenes));
    }
}
