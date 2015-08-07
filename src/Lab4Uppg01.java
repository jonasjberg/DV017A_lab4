import java.util.List;
import java.util.Vector;
import Lab3Uppg06.Berakning;

/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 1
 */

public class Lab4Uppg01
{
    private final static String TXT_QUERY            = "Hur många tal vill du mata in (max 30)? ";
    private final static int    MAX_NUMBER_OF_INPUTS = 30;
    private final static int    MIN_NUMBER_OF_INPUTS = 0;

    private static List<Integer> numbers = new Vector<Integer>();
    private static int           sum;
    private static int           average;
    private static int           min;
    private static int           max;

    public static void main(String[] args)
    {
        getInput(getNumberOfInputs());
        
        System.out.println(numbers.toString());
    }

    private static int getNumberOfInputs()
    {
        int n;

        do {
            n = UserInputFilter.getPositiveInt(TXT_QUERY);
        } while (n <= MIN_NUMBER_OF_INPUTS || n > MAX_NUMBER_OF_INPUTS);

        return n;
    }

    private static void getInput(int numberOfInputs)
    {
        int index = 0;

        while (index++ < numberOfInputs) {
            int in = UserInputFilter.getPositiveInt("> ");
            numbers.add(in);
        }
    }

}
