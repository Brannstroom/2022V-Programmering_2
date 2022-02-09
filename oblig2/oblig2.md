# Oblig 2
##### https://hiof.instructure.com/courses/5104/assignments/24956

### Oppgave 1.1
##### Class:
I Java som et objekt-orientert programmerings-språk legges det stor vekt på bruken av klasser og objekter. En klasse/class i Java vil på mange måter kunne beskrives som en template/blueprint på et objekt og vil bli brukt til å definere hvilke tilstander/trekk som objektet skal/kan ha, samt å kunne inneholde visse metoder for å f.eks. kunne prosessere eller endre atributter gitt til objektet.

Man definerer en klasse ved å bruke "[tilgangs-modifikator] class <klasse-name> [arv] [interface] { kropp }". Det er mulig å definere flere java-klasser i samme .java fil, men det vil kun være mulig å ha èn med en public tilgangs-modifikator.

##### Object (konseptet, ikke klassen):
Et objekt i Java vil være en instansiert klasse og man kan tenke på det som noe "fysisk" eller "ekte". Objekter i Java vil kunne ha en identitet og oppførsel, hvor identitet er verdiene lagret i potensielle variabler, mens oppførselen vil være metodene definert i objekt-klassen.

Hvis man forestiller seg en Person-klasse, vil klassen bestå av variabler som identifiserer en person, og hva en person består av, mens objekter vil være unike personer.

##### Instansvariabel:

En instansevariabel er en del av klassen og er en variabel som definerer et objekts identitet. Instansevariabelen vil være definert utenfor alle konstruktører, metoder og blokker, og er synlig for alle under-klasser.

##### Overloading:
Overloading er et konsept hvor man kan definere flere metoder med samme navn, bare med forskjellige parametere, og sannsynligvis forskjellig krop. Dette gir muligheten for å beholde logisk navngiving og enkelt gi valgfriheten rundt antall "inputs".

Dette er et enkelt, men sannsynlig eksempel på overloading, hvor vi har tre metoder med samme navn, men med forskjellige parametere, både i antall og type.
```
int multipliser(int a, int b) {
    return a*b;
}

int multipliser(double a, double b) {
    return a*b;
}

int multipliser(int a, int b, int c) {
    return a*b*c;
}
```

##### Overriding:
Overriding er når en under-klase har de samme metodene som er definert i over-klassen og tillater under-klassen å overskrive metoden, slik at det er metoden som blir brukt når man kaller på metoden. Et veldig vanlig eksempel på dette er å overskrive toString metoden i en under-klasse for å kunne printe ut ekstra informasjon som en over-klasse er uviten om.

Eksempel på overriding tatt fra egen oppgave hvor jeg overskriver toString metoden til over-klassen (CelestialBody) og legger til Effective temperature for å skrive ut den informasjonen i tillegg.
```
    @Override
    public String toString() {
        return super.toString() + "\nEffective temperature: " + this.effectiveTemp;
    }
```

##### Extends:
Extends er keyworded brukt for av i Java, og brukes ved defineringen av en ny klasse. En klasse kan arve fra èn over-klasse og vil med det arve alle instansevariablene og metodene til over-klassen. Dette gjør at man kan definere noe som alle under-klasser skal ha i over-klassen, mens det som er unikt for hver under-klasse skal i under-klassene.

Under viser jeg et eksempel ved en Element-klasse, og en Gold-klasse som arver fra Element-klassen. Ettersom alle Elements skal ha en masse defineres det der, men ikke alle Elementer har et smeltepunkt, derfor defineres det i underklassen Gold, som har et smeltepunkt. Et objekt av Gold-klassen vil nå ha tilgang til både getMeltingPoint() og getMass() fra overklassen, selv om den ikke er definert i sin egen klasse, men i over-klassen.

```
public class Element {
    private double mass;
    
    public double getMass() {
        return mass;
    }
}
```
```
public class Gold extends Element {
    private double meltingPoint;
    
    public double getMeltingPoint() {
        return meltingPoint;
    }
}
```
```
Gold gold = new Gold(196.97, 1064.18);
double mass = gold.getMass();
double meltingPoint = gold.getMeltingPoint();
```

##### Polymorphism:
Polymoprhism betyr "mange former" og er i Java et konsept som betyr å gjøre samme ting på flere måter. I Java har vi to typer for polymorphsim: Method overloading og Method overriding, begge forklart tidligere i oppgaven. Polymorphism kan oppstå når flere klasser slekter på grunn av arv fra samme over-klasse.



##### private,public,(protected) (klasse,variabel,metode):
Private, public og protected er tilgangs-modifikatorer i Java og definerer synligheten av en klasse, variabel eller metode. I tillegg til disse tre har man en standard (tom) tilgangs-modifikator om man ikke definerer noen. I tabellen vises det hvordan de forskjellige tilgangs-modifikatorene begrenser synligheten til f.eks. en variabel. Her kan man f.eks. se at man kun vil ha tilgang til en private metode innad i egen klasse.

| Modifikator      | Egen Klasse | Package | Under-klasse | Globalt | 
| ----------- | ----------- | ----------- | ----------- | ----------- |
| public | Ja | Ja | Ja | Ja |
| protected | Ja | Ja | Ja | nei |
| default | Ja | Ja | nei | nei |
| private | Ja | nei | nei | nei |

##### this og super:
this er et keywork i Java som brukes for å referere til objektet slik det er nå i en metode eller konstruktør.

I kode-snutten under kan vi se en helt vanlig konstruktør hvis vi bruker keyworded this. Dette tillater oss å endre name og age variablene utenfor konstruktørens som har de samme navnene på parameterne. Hvis vi fjerner this-keyworded vil Java endre verdien til parameteret, ikke instansevariabelen.
```
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Slik som vist i kode-snutten under er det også mulig å endre paramter-navna i konstruktøren slik at det kun er instansevariablene som heter name og age, noe som gjør at Java forstår at det er variablene utenfor konstruktøren som skal endres.
 ```
public class Person {
    private String name;
    private int age;

    public Person(String a, int b) {
        name = a;
        age = b;
    }
}
```


super er også et keyword i Java som brukes til å refere til variabler og metoder i sin umiddelbare over-klasse. Når man instansierer en under-klasse vil man implisitt også instansiere over-klassen, og super gjør det da mulig for under-klassen å referere til over-klassen. Hvis man f.eks. overskriver en metode i under-klassen vil man kunne hente ut original-metoden fra over-klassen ved å bruke super.


