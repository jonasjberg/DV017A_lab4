/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 3
 */

/* Eclipse-projektet för Labb #2 länkas in till det aktuella projektet så att
 * paketet 'main' och klassen 'Person' blir tillgängliga.  */
import main.Person;

/**
 * Klass 'Lab4Uppg03' testar klasserna 'Student' och 'Person'.
 */
public class Lab4Uppg03
{
    /* Plattformsspecifik nyradsmarkör. */
    private static String NEWLINE = System.getProperty("line.separator");

    private static Person  person;
    private static Student student;

    public static void main(String[] args)
    {
        init();
        testaPerson();
        testaStudent();
        System.exit(0);
    }

    /**
     * Skapar ett nytt 'Person'-objekt och ett 'Student'-objekt.
     */
    private static void init()
    {
        person = new Person("Rutherford B. Hayes", 221004000, "Ohio State U.S.",
                71);
        student = new Student("John Quincy Adams", 480711000,
                "Massachusetts U.S.", 81, "Harvard", null, 'B');
    }

    /**
     * Testar alla metoder hos 'Person'-objektet.
     */
    private static void testaPerson()
    {
        /* Skriv ut initialt läge. */
        prompt("Initial data för 'person':");
        prompt(person.toString());

        /* Anropa alla metoder .. */
        person.byterAdress("New York City");
        person.byterNamn("Theodore Roosevelt");
        person.fyllerAr();

        /* Skriv ut uppdaterat läge. */
        prompt(NEWLINE + "Uppdaterad data för 'person':");
        prompt(person.toString());
    }

    /**
     * Testar alla metoder hos 'Student'-objektet.
     */
    private static void testaStudent()
    {
        /* Skriv ut initialt läge. */
        prompt(NEWLINE + NEWLINE + "Initial data för 'student':");
        prompt(student.toString());

        /* Anropa alla metoder .. */
        student.byterAdress("Kansas City");
        student.byterNamn("John Lithgow");
        student.fyllerAr();
        student.andraSkola("Film School");
        student.andraKurs("Amazing Acting 101");
        student.andraBetyg('A');

        /* Skriv ut uppdaterat läge. */
        prompt(NEWLINE + "Uppdaterad data för 'student':");
        prompt(student.toString());
    }

    /**
     * "Wrapper" runt System.out.println() för mindre skrivande.
     * @param s     textsträng att skriva ut
     */
    public static void prompt(String s)
    {
        System.out.println(s);
    }
}
