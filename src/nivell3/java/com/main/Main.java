package nivell3.java.com.main;

import nivell3.java.com.modules.Student;
import nivell3.java.com.modules.Utilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = Utilities.fillStudentList();
        System.out.println("Hem creat la llista següent d'alumnes amb noms i edat:");
        Utilities.displayStudents(studentList);
        List<Student> studentsStartsWithA = Utilities.studentStarts_a(studentList);
        System.out.println("\nFiltrem la llista d'alumnes per mostrar els que el seu nom comença per 'a' o 'A'");
        Utilities.displayStudents(studentsStartsWithA);
        System.out.println("\nFiltrem ara la llista per mostrar els alumnes que tenen una nota de 5 o més:");
        Utilities.displayStudentsAll(Utilities.studentRating5(studentList));
        System.out.println("\nFiltrem ara la llista per mostrar els alumnes que tenen una nota de 5 o més i que no son de PHP:");
        Utilities.displayStudentsAll(Utilities.studentRating5notPhp(studentList));
        System.out.println("\nFiltrem ara la llista per mostrar els alumnes que tenen 18 anys o més i que fan JAVA:");
        Utilities.displayStudentsAll(Utilities.studentJavaOlder18(studentList));
    }
}
