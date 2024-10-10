package nivell2.exercici2.java.com.main;

import nivell2.exercici2.java.com.modules.Utilities;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> enters1 = Arrays.asList(13, 4, 52, 37, 74);
        System.out.println("Creem una llista d'Integers: " + enters1);
        String entersStr1 = Utilities.getOddEven1(enters1);
        System.out.println("Transformem la llista en una cadena on cada element s'identifica com a parell (e) o senar (o): "
                + entersStr1);
    }
}
