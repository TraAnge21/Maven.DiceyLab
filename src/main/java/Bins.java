import java.util.ArrayList;
import java.util.HashMap;

public class Bins {

private Integer lowerValue;
private Integer upperValue;
private HashMap<Integer, Integer> resultsBins;

    // Constructor
    public Bins (Integer lowerValue, Integer upperValue ) {
        this.lowerValue=lowerValue;
        this.upperValue=upperValue;
        this.resultsBins= new HashMap<Integer, Integer>();
        mappingBins();
    }

    // getter
    public Integer getBins (Integer binNumber) {

        return resultsBins.get(binNumber);

    }


    // create a map
    public HashMap<Integer, Integer> mappingBins () {

        for ( int j = lowerValue; j <= upperValue ; j++ ){
            resultsBins.put(j,0);
        }

        return resultsBins;
    }











//    private Integer [] resultToss;
//    private Integer lowerBoundValue;
//    private Integer upperBoundValue;
//
//// constructor
//    public Bins ( Integer lowerBoundValue, Integer upperBoundValue) {
//        this.lowerBoundValue= lowerBoundValue;
//        this.upperBoundValue= upperBoundValue;
//        resultToss= new Integer[upperBoundValue+1];
//
//        for (int j = lowerBoundValue-2 ; j < resultToss.length; j++) {
//            resultToss[j] =0;
//        }
//    }
//
//
//    public Integer getBins (Integer countNum) {
//        Dice dice = new Dice(2);
//        this.lowerBoundValue= dice.getNumOfDice();
//        this.upperBoundValue= dice.getNumOfDice()*6;
//
//        return resultToss[countNum];
//    }
//
//
//
//    public Integer[] getResultToss() {
//        return resultToss;
//    }
//
//
//// getter lower bound value
//    public Integer getLowerBoundValue() {
//        return lowerBoundValue;
//    }
//
//
//// getter upper bound value
//    public Integer getUpperBoundValue() {
//        return upperBoundValue;
//    }
//
//
//// increment bins number
//    public void incrementBin(Integer increment) {
//        resultToss[increment]++;
//    }
//
//
//
//


}
