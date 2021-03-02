import java.util.Random;

public class Card {
    String suite;
    int number; // J = 11, Q = 12, K = 13, A = 1
    static String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public Card() {
        Random r = new Random();
        this.suite = suites[r.nextInt(4)];
        this.number = r.nextInt(13)+1;
    }

    public Card(int suiteIndex, int number) {
        this.suite = suites[suiteIndex];
        this.number = number;
    }

    public String getSuite() {
        return suite;
    }

    public int getNumber() {
        return number;
    }
}
