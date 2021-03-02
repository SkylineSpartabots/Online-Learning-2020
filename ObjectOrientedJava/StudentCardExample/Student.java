public class Student {
    int age;
    String name;
    String[] courses;
    int _grade;
    static int IDcounter = 0;
    int ID;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        _grade = grade;
        IDcounter++;
        this.ID = IDcounter;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void printCourses() {
        for (String course : this.courses) {
            System.out.print(course + " ");
        }
        System.out.println();
    }

    public int getID() {
        return ID;
    }
}
