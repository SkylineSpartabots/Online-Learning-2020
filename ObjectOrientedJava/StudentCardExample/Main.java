public class Main {
    public static void main(String[] args) {
        /*Student vibhav = new Student("Vibhav", 17, 12);
        Student varun = new Student("Varun", 10, 2);

        String[] myCourses = {"Comp sci", "health", "pe", "biology"};
        vibhav.setCourses(myCourses);

        String[] varunsCourses = {"Comp sci", "classical writing", "chemistry", "biology"};
        varun.setCourses(varunsCourses);

        System.out.println(vibhav.getID());
        System.out.println(varun.getID());

        Student[] classroom = {varun, vibhav};

        for (Student student : classroom) {
            System.out.println(student.age);
        }*/

        Card c = new Card();
        Card a = new Card(3, 1);
        System.out.println(a.getNumber());
        System.out.println(a.getSuite());
    }
}
