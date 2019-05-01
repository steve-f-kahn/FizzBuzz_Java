package Fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String fizzbuzz( Integer args )
    {
        if (args == 3) {
            return "Fizz";
        }
        return String.format("%s", args);
    }
}
