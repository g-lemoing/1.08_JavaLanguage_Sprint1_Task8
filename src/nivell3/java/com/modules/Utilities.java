package nivell3.java.com.modules;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public static List<Student> fillStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ana", 25, "JAVA", 8));
        studentList.add(new Student("Xavier", 15, "PHP", 4));
        studentList.add(new Student("Robert", 44, "JAVA", 7));
        studentList.add(new Student("Albert", 17, "JAVA", 9));
        studentList.add(new Student("Carolina", 53, "Angular", 8));
        studentList.add(new Student("Noemí", 35, "JAVA", 5));
        studentList.add(new Student("Maria", 40, "PHP", 8));
        studentList.add(new Student("Pol", 22, "PHP", 9));
        studentList.add(new Student("Sofia", 16, "Angular", 8));
        studentList.add(new Student("Miquel", 29, "JAVA", 7));
        return studentList;
    }

    public static void displayStudents (List<Student> list){
        list.forEach(student -> System.out.println(student.nameAgetoString()));
    }

    public static void displayStudentsAll (List<Student> list){
        list.forEach(System.out::println);
    }

    public static List<Student> studentStarts_a (List<Student> list){
        return list.stream()
                .filter(student -> student.getName().toUpperCase().startsWith("A"))
                .toList();
    }

    public static List<Student> studentRating5 (List<Student> list){
        return list.stream()
                .filter(student -> student.getRating() >= 5)
                .toList();
    }

    public static List<Student> studentRating5notPhp (List<Student> list){
        return list.stream()
                .filter(student -> student.getRating() >= 5 && !student.getCourse().equals("PHP"))
                .toList();
    }

    public static List<Student> studentJavaOlder18 (List<Student> list){
        return list.stream()
                .filter(student -> student.getAge() >= 18 && student.getCourse().equals("JAVA"))
                .toList();
    }
}
