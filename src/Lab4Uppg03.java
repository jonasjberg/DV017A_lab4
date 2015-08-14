
/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 3
 */

import main.Person;

/**
 * Klass 'Lab4Uppg03' testar klasserna 'Student' och 'Person'.
 */
public class Lab4Uppg03
{
    private static Person  person;
    private static Student student;

    public static void main(String[] args)
    {
        init();
        testaPerson();
        testaStudent();
        System.exit(0);
    }

    private static void init()
    {
        person = new Person("Rutherford B. Hayes", 221004000, "Ohio State U.S.",
                71);
        student = new Student("John Quincy Adams", 480711000,
                "Massachusetts U.S.", 81, "Harvard", null, 'A');
    }

    private static void testaPerson()
    {
        /* Skriv ut initialt läge. */
        prompt("Data för 'person':");
        prompt(person.toString());

        /* Anropa alla metoder .. */
        person.byterAdress("helt ny ADRESS");
        person.byterNamn("helt nytt NAMN");
        person.fyllerAr();

        /* Skriv ut information om 'Person'-objekten.
         * Använder '\n' newlines trots att det inte är särskilt portabelt .. */
        prompt ("\nData för 'person':\n-------"
              + "\nNamn:         " + person.hamtaNamn()
              + "\nPersonnummer: " + person.hamtaPersnr()
              + "\nAdress:       " + person.hamtaAdress());
    }
    
    private static void testaStudent()
    {
        /* Skriv ut initialt läge. */
        prompt("Data för 'student':");
        prompt(student.toString());

        /* Anropa alla metoder .. */
        student.byterAdress("HELT NY adress");
        student.byterNamn("HELT NYTT namn");
        student.fyllerAr();
        student.

        /* Skriv ut information om 'Student'-objekten.
         * Använder '\n' newlines trots att det inte är särskilt portabelt .. */
        prompt ("\nData för 'person':\n-------"
              + "\nNamn:         " + person.hamtaNamn()
              + "\nPersonnummer: " + person.hamtaPersnr()
              + "\nAdress:       " + person.hamtaAdress());
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
