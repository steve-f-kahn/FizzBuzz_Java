package Fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

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
        assertEquals("Fizz", app.fizzbuzz(3));
    }

    @Test
    public void fizzbuzzShouldReturnBuzzGiven5()
    {
        App app = new App();
        assertEquals("Buzz", app.fizzbuzz(5));
    }

    @Test
    public void fizzbuzzShouldReturnFizzBuzzGiven15()
    {
        App app = new App();
        assertEquals("FizzBuzz", app.fizzbuzz(15));
    }

    @Test
    public void fizzbuzzShouldReturnFizzGiven6()
    {
        App app = new App();
        assertEquals("Fizz", app.fizzbuzz(6));
    }
}
