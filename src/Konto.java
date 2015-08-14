/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 2
 */

/**
 * Klass 'Konto' representerar ett bankkonto.
 */
public class Konto
{
    /* Fall tillbaka på dessa som defaults. */
    private static final String DEFAULT_NAME = "okänt";

    /* Alla konton har samma räntesats (ränta per år) */
    private static double rantesats;

    private double saldo;
    private int    kundnr;
    private String kundnamn;

    /**
     * Konstruktor för ett bankkonto
     * @param saldo         kontots saldo
     * @param kundnr        kundens nummer
     * @param kundnamn      kundens namn
     */
    public Konto(double saldo, int kundnr, String kundnamn)
    {
        this.saldo = saldo;
        this.kundnr = kundnr;
        this.kundnamn = kundnamn;
    }

    /**
     * Ökar saldot med värde -- sätt in pengar.
     * @param summa     saldot ökas med denna mängd
     */
    public void insattning(double summa)
    {
        if (summa > 0)
            saldo += summa;
    }

    /**
     * Minskar saldot med värde -- ta ut pengar.
     * @param summa     saldot minskas med detta värde
     */
    public void uttag(double summa)
    {
        if (summa > 0)
            if (summa <= saldo)
                saldo -= summa;
    }

    /**
     *  Returnerar kontots saldo.
     * @return      kontots saldo
     */
    public double hamtaSaldo()
    {
        return saldo;
    }

    /**
     * Returnerar kundens namn om det är definierat, annars 'DEFAULT_NAME'.
     * @return      kundens namn
     */
    public String hamtaKundnamn()
    {
        if (kundnamn != null)
            return kundnamn;
        else
            return DEFAULT_NAME;
    }

    /**
     * Returnerar den gemensamma räntesatsen.
     * @return      räntesatsen
     */
    public static double avlasRantesats()
    {
        return rantesats;
    }

}
