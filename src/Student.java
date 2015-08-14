
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
    private static final char   INGET_BETYG = 'G';

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
    public void andraKurs(String kurs)
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
    public void andraBetyg(char betyg)
    {
        betyg = Character.toUpperCase(betyg);

        switch (betyg) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
            this.betyg = betyg;
            break;
        default:
            this.betyg = INGET_BETYG;
        }
    }

    /**
     * Ändra skola enligt parameterns värde.
     * @param skola     ny skola
     */
    public void andraSkola(String skola)
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
    public String hamtaKurs()
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
    public char hamtaBetyg()
    {
        return betyg;
    }

    /**
     * Returnerar studentens skola.
     * @return      studentens skola
     */
    public String hamtaSkola()
    {
        if (skola != null)
            return skola;
        else
            return INGEN_SKOLA;
    }

    /**
     * Auto-genererad med Eclipse ("source" --> "Generate toString()...") och
     * sedan modifierad för att inkludera hantering av plattformsspecifika
     * nyradsmarkeringar.
     */
    @Override
    public String toString()
    {
        /* Plattformsspecifik nyradsmarkör. */
        String NEWLINE = System.getProperty("line.separator");
        StringBuilder str = new StringBuilder();

        /* Anropa först 'Person'-objektets 'toString()'-metod. */
        str.append(super.toString());

        /* Utöka sedan med 'Student'-objektets data. */
        str.append("Skola:        " + skola + NEWLINE);
        str.append("Kurs:         " + kurs + NEWLINE);
        str.append("Betyg:        " + betyg + NEWLINE);

        return str.toString();
    }
}
