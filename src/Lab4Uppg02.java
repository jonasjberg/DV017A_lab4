/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #4    Uppgift 2
 */

import java.util.List;
import java.util.Vector;

/**
 * Klass 'Lab4Uppg02' testar klassen 'Konto'
 */
public class Lab4Uppg02
{
    private static Konto             k1;
    private static Konto             k2;
    private static final List<Konto> konton = new Vector<Konto>();

    public static void main(String[] args)
    {
        k1 = new Konto(3500000, 13, "Gibson Pälsmann");
        k2 = new Konto(100, 8641, "Foobar Bar");

        konton.add(k1);
        konton.add(k2);

        info(konton);

        konton.get(0).insattning(2.50);
        konton.get(1).insattning(4200);

        info(konton);

        konton.get(0).uttag(1000001);
        konton.get(1).uttag(4500);

        info(konton);
        
        System.exit(0);
    }

    /**
     * Skriver ut information om bankkonton i en lista.
     * @param konton    listan med konton
     */
    private static void info(List<Konto> konton)
    {
        System.out.println("");
        for (Konto k : konton) {
            System.out.println("kundnamn: " + k.hamtaKundnamn());
            System.out.println("saldo:    " + k.hamtaSaldo());
        }

        System.out.println(("Räntesats:   " + Konto.avlasRantesats()));
    }

}
