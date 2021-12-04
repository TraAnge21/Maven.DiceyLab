import java.util.Random;

public class Dice {

    // a number of N random-tossed dies.
 private Integer numOfDice;

// constructor
    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;

    }

    // getter
    public Integer getNumOfDice() {
        return numOfDice;
    }

    // setter
    public void setNumOfDice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

// a method to calculate the sum of dice after several toss
    public Integer sumOfToss () {
        Random rand = new Random();
        int min = 1;
        int max = 6;
        Integer sumTossDice =0;
        // random toss of dice and their sum
        for (int j = 1; j <= numOfDice ; j++) {
            sumTossDice+= rand.nextInt(max-min+1)+1;

        }
        return sumTossDice;


    }


}
