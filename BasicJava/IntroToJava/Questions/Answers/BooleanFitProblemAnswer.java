package Questions.Answers;


public class BooleanFitProblemAnswer {
    private static int temp = 60;
    private static boolean isRaining = false;
    public static void main(String[] args) {
        System.out.println("Temp: " + temp);
        System.out.println("isRaining: " + isRaining + "\n");
        
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
            System.out.println("T-Shirt");
        } else {
            System.out.println("Tank Top");
        }

        if(temp < 40 || temp > 70) {
            System.out.println("Hat");
        } else {
            System.out.println("No Hat");
        }

        if(isRaining) {
            System.out.println("Raincoat");
        } else {
            System.out.println("No Raincoat");
        }
    } 
}
