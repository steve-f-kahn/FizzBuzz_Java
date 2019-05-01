package Fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test 
    public void fizzbuzzShouldReturn2given2()
    {
        App app = new App();
        assertEquals("2", app.fizzbuzz(2));
    }

    @Test 
    public void fizzbuzzShouldReturnFizzGiven3()
    {
        App app = new App();
        assertEquals("Fizz", app.fizzbuzz(2));
    }
}
