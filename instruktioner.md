Laboration 4
============


Redovisning:
------------

Läs igenom hela laborationen innan du börjar.

Lycka till!


Uppgifter:
----------

1.  Skriv ett program där man ska skriva in ett antal heltal. Hur många tal ska
    den som kör programmet själv bestämma, dock max 30. Heltalen ska lagras i
    en array.

    Programmet ska sedan beräkna summan av talen, beräkna talens medelvärde
    (exakta), ta reda på vilket av talen som är störst och minst. Exempel på hur
    utskriften kan se ut (inmatning från tangentbordet = *fetstil*):

    Hur många tal vill du mata in (max 30)? *5*
    *4*
    *5*
    *3*
    *7*
    *6*
    Summa: 25
    Medelvärde: 5.0
    Minsta värde: 3
    Största värde: 7


2.  Skriv en klass Konto som representerar ett bankkonto. Klassen ska innehålla
    data om ett bankkonto enligt följande (alltså klassens instansvariabler):

    saldo (double)
    kundnr (int)
    kundnamn (String)

    Klassen ska även ha en klassvariabel (static variabel) som heter:

    räntesats (double)

    Varför ska den vara en klassvariabel? Jo, eftersom alla konton har samma
    räntesats (ränta per år).

    De metoder som ska finnas i klassen Konto är följande:

    - insättning, metod som ökar saldot med parameterns värde.
    - uttag, metod som minskar saldot med parameterns värde.
    - hämtaSaldo, metod som returnerar saldo.
    - hämtaKundnamn, metod som returnerar kundnamn.
    - avläsRänteSats, *klassmetod* som returnerar räntesatsen.

    Det ska naturligtvis finnas en konstruktor.

    Skriv en testklass (testprogram) som skapar två konton. Gör insättning och
    uttag med valfria belopp på kontona. Skriv sedan ut kontonas saldon och
    kundens namn. Skriv sist ut vilken räntesats de båda kontona har.

3.  I denna uppgift ska du använda dig av klassen Person som du skrev i
    laboration 3, *utan* att göra några ändringar i den. Skriv en till klass
    Student som ärver klassen Person (Student blir alltså en subklass till
    Person). I klassen Student ska du ha dessa instansvariabler:

    kurs (String)
    betyg (char)
    skola (String)

    I klassen Student ska du ha följande metoder:

    - ändraKurs, ändrar kurs enligt parameterns värde.
    - ändraBetyg, ändrar betyg enligt parameterns värde.
    - ändraSkola, ändrar skola enligt parameterns värde.
    - hämtaKurs, returnerar kurs.
    - hämtaBetyg, returnerar betyg.
    - hämtaSkola, returnerar skola.
    - toString, en metod som i en snyggt formaterad sträng returnerar ett
      Student-objekts *samtliga* data, även indirekt "ärvda" data från klassen
      Person. Metoden anropas genom att skriva objektets (referensens) namn.

    Och naturligtvis ska du ha med en konstruktor, där du ska initiera alla
    instansvariabler inkl de som ligger i superklassen Person.

    Skriv slutligen en testklass där du skapar ett Person-objekt och ett
    Student-objekt.  Testa först alla metoder som går att anropa på
    Person-objektet och testa sedan alla metoder som går att anropa på
    Student-objektet.

