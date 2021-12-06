import java.util.Random;

public class Dice {

    private final Integer numofDices;
    private Random rand = new Random();

    // constructor
    public Dice(Integer numofDices) {
        this.numofDices = numofDices;
    }


    public Integer sumofToss() {

        int sumTossDice = 0;
        // random toss of dice and their sum
        for (int j = 1; j <= numofDices; j++) {
            sumTossDice += rand.nextInt(6) + 1;

        }
        return sumTossDice;

    }
}












