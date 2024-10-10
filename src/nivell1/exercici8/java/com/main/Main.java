package nivell1.exercici8.java.com.main;

import nivell1.exercici8.java.com.modules.InvertCadena;

public class Main {
    public static void main(String[] args) {
        InvertCadena reverseCadena = inStr -> new StringBuilder(inStr).reverse().toString();
        String cadena = "I love to travel";
        System.out.println("La cadena invertida de " + cadena + " és: " + reverseCadena.reverse(cadena));
    }
}
