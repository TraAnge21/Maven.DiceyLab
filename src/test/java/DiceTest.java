import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void sumofToss() {

    // given

       Dice dice = new Dice (2);

    // when

     int actual = dice.sumofToss();

    // then
        Assert.assertTrue(actual >1 && actual <13);

    }

}