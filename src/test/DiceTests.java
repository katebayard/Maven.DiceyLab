import org.junit.Assert;
import org.junit.Test;

public class DiceTests {


    @Test
    public void testRandomDieToss() {
        //Given
        Integer numberOfDice = 2;

        //When
        Dice newDice = new Dice(numberOfDice);

        //
        Assert.assertTrue(Dice.randomDieToss() <= 6);
        Assert.assertTrue(Dice.randomDieToss() >= 1);

    }

    @Test
    public void testDiceTossAndSum1() {

        //Given
        Integer numberOfDice = 2;

        //When
        Dice newDice = new Dice(numberOfDice);

        //Then
        Assert.assertTrue(Dice.tossAndSum(numberOfDice) <= numberOfDice * 6);
        Assert.assertTrue(Dice.tossAndSum(numberOfDice) >= numberOfDice);
    }

    @Test
    public void testDiceTossAndSum2() {

        //Given
        Integer numberOfDice = 4;

        //When
        Dice newDice = new Dice(numberOfDice);

        //Then
        Assert.assertTrue(Dice.tossAndSum(numberOfDice) <= numberOfDice * 6);
        Assert.assertTrue(Dice.tossAndSum(numberOfDice) >= numberOfDice);
    }


}
