package nivell2.exercici3.java.com.main;

import nivell2.exercici3.java.com.modules.Calc;

public class Main {
    public static void main(String[] args) {
        final float a = 17.89F;
        final float b = 9.12F;
        System.out.println("Havent definit dos floats " + a + " i " + b + ", en calculem la suma: " + a + " + " + b + " = "
                + Calc.sum.operacio(a, b));
        System.out.println("La seva resta " + a + " - " + b + " = "
                + Calc.substraction.operacio(a, b));
        System.out.println("La seva mutiplicació " + a + " x " + b + " = "
                + Calc.multiplication.operacio(a, b));
        System.out.println("I La seva divisió " + a + " / " + b + " = "
                + Calc.division.operacio(a, b));
    }
}
