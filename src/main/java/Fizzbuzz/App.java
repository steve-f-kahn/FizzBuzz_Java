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
        if (args % 15 == 0){
            return "FizzBuzz";
        } else if (args % 3 == 0) {
            return "Fizz";
        } else if (args % 5 == 0) {
            return "Buzz";
        } else {
            return String.format("%s", args);
        }
    }
}
