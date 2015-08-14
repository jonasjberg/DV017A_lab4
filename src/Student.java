
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
 * Klass 'Student' representerar en student. Subklass till klassen 'Person'.
 */
public class Student extends Person
{
    private static final String INGEN_KURS  = "Ej anmäld till någon kurs";
    private static final String INGEN_SKOLA = "Ej registrerad på någon skola";

    private String skola;
    private String kurs;
    private char   betyg;

    /**
     * Konstruktor för en student.
     * @param namn      studentens namn
     * @param ID        studentens ID
     * @param adress    studentens adress
     * @param alder     studentens ålder
     */
    public Student(String namn, long ID, String adress, int alder, String skola,
            String kurs, char betyg)
    {
        super(namn, ID, adress, alder);

        andraSkola(skola);
        andraKurs(kurs);
        andraBetyg(betyg);
    }

    /**
     * Ändrar kurs enligt parameterns värde.
     * @param kurs      ny kurs
     */
    private void andraKurs(String kurs)
    {
        if (kurs != null)
            this.kurs = kurs;
        else
            this.kurs = INGEN_KURS;
    }

    /**
     * Ändra betyg enligt parameterns värde.
     * @param betyg     nytt betyg
     */
    private void andraBetyg(char betyg)
    {
        this.betyg = betyg;
    }

    /**
     * Ändra skola enligt parameterns värde.
     * @param skola     ny skola
     */
    private void andraSkola(String skola)
    {
        if (skola != null)
            this.skola = skola;
        else
            this.skola = INGEN_SKOLA;
    }

    /**
     * Returnerar kurs studenten är anmäld till.
     * @return      studentens kurs
     */
    private String hamtaKurs()
    {
        if (kurs != null)
            return kurs;
        else
            return INGEN_KURS;
    }

    /**
     * Returnerar studentens betyg.
     * @return      studentens betyg
     */
    private char hamtaBetyg()
    {
        return betyg;
    }

    /**
     * Returnerar studentens skola.
     * @return      studentens skola
     */
    private String hamtaSkola()
    {
        if (skola != null)
            return skola;
        else
            return INGEN_SKOLA;
    }
}
