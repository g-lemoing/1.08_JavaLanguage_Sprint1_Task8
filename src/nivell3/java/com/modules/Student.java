package nivell3.java.com.modules;

public class Student {
    private String name;
    private int age;
    private String course;
    private int rating;

    public Student (String name, int age, String course, int rating){
        this.name = name;
        this.age = age;
        this.course = course;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Alumne {" +
                "nom: " + name +
                ", edat: " + age +
                ", curs: " + course +
                ", nota: " + rating +
                '}';
    }

    public String nameAgetoString() {
        return "Alumne {" +
                "nom: " + name +
                ", edat: " + age +
                '}';
    }
}
