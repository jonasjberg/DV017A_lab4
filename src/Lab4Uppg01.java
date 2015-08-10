/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 1
 */

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4Uppg01
{
    private final static String TXT_QUERY            = "Hur många tal vill du mata in (max 30)? ";
    private final static int    MAX_NUMBER_OF_INPUTS = 30;
    private final static int    MIN_NUMBER_OF_INPUTS = 0;
    
    private static List<Integer> numbers = new Vector<Integer>();
    private static int           sum;
    private static double        average;
    private static int           min;
    private static int           max;

    /* Använder en "Logger" för att hantera debug-meddelanden */
    private static Logger        logger  = Logger.getAnonymousLogger();
    
    /* MAIN */
    public static void main(String[] args)
    {
        /* Debug-meddelanden av/på */
        logger.setLevel(Level.OFF);

        getInput(getNumberOfInputs(), numbers);
        doCalculation(numbers);
        printResults();
    }

    /**
     * Frågar efter ett antal tal att senare utföra beräkningar på.
     * @return  antal tal som ska matas in
     */
    private static int getNumberOfInputs()
    {
        int n;

        do {
            n = UserInputFilter.getPositiveInt(TXT_QUERY);
        } while (n <= MIN_NUMBER_OF_INPUTS || n > MAX_NUMBER_OF_INPUTS);

        return n;
    }

    /**
     * Fyller en lista med ett antal heltal med användarens inmatning.
     * @param numberOfInputs    antal heltal som ska matas in i listan
     * @param numbers           lista att stoppa talen i
     */
    private static void getInput(int numberOfInputs, List<Integer> numbers)
    {
        int currentPos = 0;

        while (currentPos++ < numberOfInputs) {
            int in = UserInputFilter.getPositiveInt("(" + currentPos + "): ");
            numbers.add(in);
        }
    }

    /**
     * Utför beräkningar på en lista.
     * @param numbers   lista att utföra beräkningar på
     */
    private static void doCalculation(List<Integer> numbers)
    {
        logger.entering("doCalculation", "getSum");
        sum = getSum(numbers);
        logger.entering("doCalculation", "getAverage");
        average = getAverage(numbers);
        logger.entering("doCalculation", "getMin");
        min = getMin(numbers);
        logger.entering("doCalculation", "getMax");
        max = getMax(numbers);
    }

    /**
     * Returnerar summan av talen i en lista.
     * @param numbers   lista att undersöka
     * @return  summan av talen i listan
     */
    private static Integer getSum(List<Integer> numbers)
    {
        int sum = 0;

        for (Integer n : numbers) {
            logger.info("sum = " + sum);
            sum += n;
        }

        return sum;
    }

    /**
     * Returnerar medelvärdet för talen i en lista.
     * @param numbers   lista att undersöka
     * @return  medelvärdet av talen i listan
     */
    private static double getAverage(List<Integer> numbers)
    {
        int sum = getSum(numbers);

        double average = sum / numbers.size();

        logger.info("average = " + sum);
        return average;
    }

    /**
     * Returnerar det minsta värdet i en lista.
     * @param numbers   lista att undersöka
     * @return  det minsta värdet i listan
     */
    private static int getMin(List<Integer> numbers)
    {
        int index = 0;
        int min = Integer.MAX_VALUE;

        do {
            logger.info("min = " + min);

            if (numbers.get(index) < min)
                min = numbers.get(index);

            index++;
        } while (index < numbers.size());

        return min;
    }

    /**
     * Returnerar det största värdet i en lista.
     * @param numbers   lista att undersöka
     * @return  det största värdet i listan
     */
    private static int getMax(List<Integer> numbers)
    {
        int index = 0;
        int max = Integer.MIN_VALUE;

        do {
            logger.info("max = " + max);

            if (numbers.get(index) > max)
                max = numbers.get(index);

            index++;
        } while (index < numbers.size());

        return max;
    }

    /**
     * Skriver ut resultatet av beräkningarna.
     */
    private static void printResults()
    {
        System.out.println("Summa:         " + sum);
        System.out.println("Medelvärde:    " + average);
        System.out.println("Minsta värde:  " + min);
        System.out.println("Största värde: " + max);
    }
}
