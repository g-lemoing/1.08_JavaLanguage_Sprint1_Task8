package nivell1.exercici5.java.com.main;

import nivell1.exercici5.java.com.modules.Calc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Instanciem la interfície Calc mitjançant una funció lambda, assignant-li el valor de Pi.");
        Calc pi = () -> 3.1415;
        System.out.println("El valor aproximat de Pi és: " + pi.getPiValue());
    }
}
