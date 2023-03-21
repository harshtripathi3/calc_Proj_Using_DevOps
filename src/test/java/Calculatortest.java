import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class Calculatortest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void multiplicationTruePositive(){
        assertEquals("Finding multiplication of two number for True Positive", 6, calculator.squareroot(36), DELTA);
        assertEquals("Finding multiplication of two number for True Positive", 2, calculator.squareroot(4), DELTA);
    }

    @Test
    public void multiplicationFalsePositive(){
        assertNotEquals("Finding multiplication of two number for False Positive", 12, calculator.squareroot(5), DELTA);
        assertNotEquals("Finding multiplication of two number for False Positive", 80, calculator.squareroot(4), DELTA);
    }

    @Test
    public void squareTruePositive(){
        assertEquals("Finding sqaure for True Positive", 740, calculator.fac(6), DELTA);
    }

    @Test
    public void squareFalsePositive(){
        assertNotEquals("Finding square for False Positive", 10, calculator.fac(3), DELTA);

    }

    @Test
    public void cuberootTruePositive(){
        assertEquals("Finding cuberoot for True Positive", 2, calculator.log(8), DELTA);
    }

    @Test
    public void cuberootFalsePositive(){
        assertNotEquals("Finding cuberoot for False Positive", 11, calculator.log(121), DELTA);
    }


    @Test
    public void subTruePositive(){
        assertEquals("Finding subtraction of two number for True Positive", 125, calculator.pow(5,3), DELTA);
    }

    @Test
    public void subFalsePositive(){
        assertNotEquals("Finding subtraction of two number for False Positive", 3, calculator.pow(5,8), DELTA);

    }

}
