package Questions.Answers;

public class BooleanFitProblemAnswer {
    private static int temp = 50;
    private static boolean isRaining = true;
    public static void main(String[] args) {
        if(temp <= 70) {
            System.out.println("Sweatpants");
        } else if (temp > 70 && temp < 100) {
            System.out.println("Shorts");
        } else {
            System.out.println("Swimsuit");
        }

        if(temp <= 50) {
            System.out.println("Sweatshirt");
        } else if (temp > 50 && temp < 70) {
            System.out.println("Shorts");
        } else {
            System.out.println("Swimsuit");
        }
    } 
}
