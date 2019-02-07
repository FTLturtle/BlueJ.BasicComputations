
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShortCalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShortCalculatorTest
{
    ShortCalculator shortCalculator;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        shortCalculator = new ShortCalculator();
    }
    
    @Test
    public void testShortAddition() {
        short baseValue = 1329;
        short addedValue = 71;
        short expected = 1400;
        
        short actual = shortCalculator.add(baseValue, addedValue);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testShortSubtraction() {
        short baseValue = 1329;
        short addedValue = 29;
        short expected = 1300;
        
        short actual = shortCalculator.subtract(baseValue, addedValue);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testShortDivision() {
        short baseValue = 1000;
        short addedValue = 10;
        short expected = 100;
        
        short actual = shortCalculator.divide(baseValue, addedValue);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testShortMultiplication() {
        short baseValue = 100;
        short addedValue = 10;
        short expected = 1000;
        
        short actual = shortCalculator.multiply(baseValue, addedValue);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testShortRemainder() {
        short baseValue = 100;
        short addedValue = 9;
        short expected = 1;
        
        short actual = shortCalculator.remainder(baseValue, addedValue);
        
        assertEquals(expected, actual);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
