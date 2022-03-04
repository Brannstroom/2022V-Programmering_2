# Oblig 3
##### https://hiof.instructure.com/courses/5104/assignments/25222

### Oppgave 1.1
#### Static (variabel, metode):
I Java forteller nøkkelordet static at en metode eller variabel skal tilhøre klassen og ikke instansierte objekter av klassen. Dette gjør at en statisk variabel er tilgjengelig ved å kalle på klassen, helt uten å instansiere et objekt av klassen. Alle instansierte objekter vil også dele den samme verdien i statiske variabler.


#### Final (variabel, metode, klasse):
For å definere konstante, faste veriabler, metoder og klasser bruker vi nøkkelordet final. Dette gjør at verdien ikke kan endres. En final variabel må alltid instansieres, da den ikke kan endres, og derfor ikke bli instansiert i ettertid.

#### Abstract (klasse, metode):
Abstrahering i Java er det å skjule visse klasser og metoder for seg selv da det ikke skal tas i bruk direkte. Det er mulig å abstrahere både klasser og metoder med nøkkelorder "abstract".

Ved å benytte abstract for å abstrahere en klasse gjør du effektivt at klassen ikke kan instansieres, men det er fortsatt mulig å arve fra klassen. Dette gjør at en over-klasse effektivt kan implementere metoder som skal være felles for under-klasser uten å kunne instansieres. 

På samme måte er det også mulig å abstrahere metoder i Java. En abstrakt metode har ingen kropp (innhold), da det er under-klassene som skal tilføre en kropp. Alle abstrakte metoder i over-klassen MÅ overskrives i under-klassen.

#### Interface:
Et interface i Java kan på mange måter sammenlignes med en mal. Et interface er en totalt abstrahert klasse helt uten fungerende kropp, men blir kun brukt som en mal som under-klasser kan implementere.







#
#
<!DOCTYPE html>
<body>
    <details>
        <summary>Oppgavetekst</summary>
         Denne obligen inneholder en del matematikk i de senere oppgavene. Du SKAL forsøke å løse alle oppgavene etter beste evne, men hvis du ikke har fått til alt i forbindelse med det matematiske vil ikke dette vektlegges like mye. Bonusoppgavene er ikke nødvendig å løse for å få godkjent, men gir ofte god lærdom. Hvis du har en oppgave som du har forsøkt på, men ikke fått helt til, er det OK om denne kommenteres ut slik at vi kan se hvordan du har tenkt/hva du har forsøkt på. Resterende kode bør kunne kompileres og kjøres uten at det krasjer. Oppgaver som er gjennomført og fungerer burde dermed ikke kommenteres ut.

Obligen er strukturert opp i oppgaver, dere skal levere de forskjellige filene på følgende formater:

Teorispørsmålene: Ikke .zip denne sammen med programmeringen, men levér som en egen fil. Leveres som docx/pdf/txt navngitt:
Oblig3_<DittNavn>.<filtype>
Eks: Oblig3_Ole-EdvardØrebæk.pdf

Klassediagram: Ikke .zip denne sammen med programmering, men levér som en egen fil. Leveres som et "bilde" av typen PNG/JPEG/SVG og navngitt:
Oblig3_Klassediagram_<DittNavn>.<filtype>
Eks: Oblig3_Klassediagram_Ole-EdvardØrebæk.PNG

Programeringsoppgavene: Leveres som en .zip fil med intelliJ-prosjektet (prosjektmappen). Zip-filen skal være navngitt som følger:
Oblig3_<DittNavn>.zip
Eks: Oblig3_Ole-EdvardØrebæk.zip

Teori
Oppgave 1.1 - Ord og begreper

Lag deg en oversikt over hva følgende ord/begreper betyr:

Static (variabel, metode)
Final (variabel, metode, klasse)
Abstract (klasse, metode)
Interface (ikke vektlagt mye ettersom temaet ikke er nøye gjennomgått)
Oppgave 1.2 - Klassediagram

Basert på det du gjør i programmeringsoppgavene under, lag et klassediagram over alle klassene med variabler og metoder, samt relasjonene mellom disse klassene.
Hvis du gjør noe mer enn det som er definert i programmeringsoppgavene underveis, for eksempel løser noe med ekstra metoder eller lignende, lag i tillegg et modifisert klassediagram som reflekterer dette.
Legg med klassediagrammet(ene) i teoridokumentet og som individuell fil.

Dere kan selv velge "verktøyet" for å lage klassediagram, noen alternativer er:

draw.io (Lenker til en ekstern side.) (web, gratis, open source)
lucidchart.com (Lenker til en ekstern side.) (web, krever konto, maks 10 diagrammer)
PlantUML (Lenker til en ekstern side.) (plugin IntelliJ, kan kodes, krever også Graphviz (Lenker til en ekstern side.))
Programmering
Vi skal fortsette med å utvide oppgaven vi lagde i Oblig 2. Du kan fortsette på din egen implementasjon, eller du kan starte fra løsningsforslaget som finnes her:

Oblig2_Løsningsforslag

Vi lagde oss en oversikt over planetsystemer og tilhørende planeter og stjerne. Vi skal nå utvide prosjektet til å ta for seg ytterligere himmellegemer.

Oppdaterte data å ta utgangspunkt i finnes her: solar_system_data_oblig3.txt

Oppgave 2.1 - Arv

Hvis vi ser nærmere på Planet og Star så ser vi at disse har flere instansvariabler som er identiske. Begge disse klassene kan sees på som himmellegemer eller "Celestial Body". En Planet "is a"  Celestial Body, og en Star "is a" Celestial Body.

Vi ønsker derfor å abstrahere de instansvariablene som er felles til en ny klasse: CelestialBody.

Abstraher (flytt) instansvariablene som er felles fra Star og Planet til en ny klasse CelestialBody
Flytt metoder du mener hører med i Celestial Body
Lag minst èn kontruktør i Celestial Body
Sett Planet og Star til extends CelestialBody
Pass på å kalle super-konstruktøren i Planet og Star
Verifiser at all kode vi har i Main.java fortsatt kjører som den skal
Kan du se noen potensielle problemer med noen av instansvariablene/metodene det er naturlig å flytte?



Oppgave 2.2 - Navn

Det er ønskelig å kunne hente ut en planet fra et PlanetSystem basert på navn. Lag en metode som gjør dette. Dette krever sammenligning av String-verdier. Du kan lese om forskjellige måter dette kan gjøres her (Lenker til en ekstern side.).



Oppgave 2.3 - Konstanter

I oblig 2 lagde vi noen metoder for å kunne hente ut verdier i kg og km fremfor de astronomiske enhetene. Denne konverteringen tok for seg noen satte verdier for disse. F.eks. 1 Rjup = 71492km. I denne obligen vil disse metodene bli referert til som getMassInKg() og getRadiusInKm().

Lag disse verdiene som konstanter (static final) i sine respektive klasser, og benytt disse konstantene i getMassInKg()- og getRadiusInKm()-metodene.



Oppgave 2.4 - Naturlig satellitt og arv

I astronomi har vi et konsept som går på at objekter går i bane rundt andre objekter. Disse kalles satellitter. En naturlig satellitt er f.eks. en måne eller planet som går i bane rundt en planet eller en stjerne. F.eks. er jorden en satellitt fordi den går i bane rundt solen. På samme måte er månen en satellitt fordi den går i bane rundt jorda.

Vi ønsker å kunne gjøre enkle beregninger av disse banene, og vil derfor å introdusere konseptet med satellitter. Vi skal derfor lage en ny klasse NaturalSatellite.

a) - Naturlig satellitt data

De aller fleste av disse banene går i en form for ellipse. For å kunne beregne banen og hastigheten til en naturlig satellitt, trenger vi noen datapunkter. Disse er:

semiMajorAxis - denne gir den lengste avstanden fra brennpunktet i en ellipse til yttersiden, altså fra planeten til stjernen den sirkler rundt (dette er ikke heeelt korrekt, men vi kan forholde oss til det slik)
eccentricity - Et decimaltall mellom 0 og 1 som sier noe om hvordan ellipseformen er
orbitalPeriod - Hvor lang tid det tar for å sirkle en runde (i jordens dager)
centralCelestialBody - Hvilken CelestialBody denne naturlige satelitten går i bane rundt

Lag klassen NaturalSatellite med de nevnte datapunktene, en passende konstruktør, samt get- og set-metoder.


b) - Naturlig satelitt arv

Hvis vi sier at en NaturalSatellite "is a" CelestialBody, og Planet "is a" NaturalSatellite. Mens Star "is a" CelestialBody, men ikke en NaturalSatelite. Hvordan blir det nå naturlig å sette opp arvehierarkiet?

Gjør de naturlige endringene for å få dette nye arvehierarkiet til å fungere som tiltenkt. Det vil bli nødvendig å endre på konstruktører.

Gjør endringer i Main.java slik at planetene som lages i planetsystemet får de nye dataene vi har spesifisert.



2.5 - Abstraksjon

I overordnet forstand skal programmet vårt til nå ha mulighet til å opprette og holde på tre "spesifikke" typer objekter, nemlig av klassene Planet, Star og PlanetSystem. Klassen CelestialBody er bare ment for å "samle" felles kodelogikk for Planet, og Star, mens klassen NaturalSatelite er ment for å skille på "celesital bodies" som er naturlige satellitter (f.eks. planeter) og de som ikke er det (f.eks. solen). Med andre ord er det ingen hensikt opprette direkte objekter av klassene CelestialBody og NaturalSatelite.

a) - Abstrakte klasser

Gjør endringer i klassene CelestialBody og NaturalSatelite slik at disse er satt til å være abstrakte, som vil gjøre at vi kan arve fra disse klassene, men ikke opprette objekter av dem.

b) - Abstrakte metoder

I oppgave 2.1 la du kanskje merke til at metodene for å returnere masse og radius er felles for både Planet og Star, og det gir dermed mening å definere disse metodene i CelestialBody. På en annen side er dette problematisk ettersom at utregningene av masse og radius er avhengig av om det gjelder en planet eller en stjerne på grunnlag av de astronomiske enhetene (Rjup, Rsun, osv.). Det kan derfor være fornuftig å definere i CelestialBody at dens barneklasser skal inneholde disse metodene, men som der må unikt defineres. Med andre ord:

Lag to abstrakte metoder i CelestialBody:
getMassInKg()
getRadiusInKm()
Implementer disse metodene unikt for klassene Planet og Star.


Oppgave 2.6 - Avstand (Du skal gjøre et forsøk på denne)

Vi ønsker å kunne finne avstanden mellom en naturlig sattelitt og objektet det går i bane rundt.  For å gjøre dette kan vi benytte Kepler's orbit formula.

kepler_orbit_formula.gif

r = avstanden i AU (AstronomicalUnits - 1AU = gjennomsnittlige avstanden mellom jorda og sola)
a = semiMajorAxis
e = eccentricity
θ (utales "theta") =  vinkelen (true anomaly) (mellom den posisjonen vi vil ha avstanden for, og punktet hvor den naturlige satelitten er nærmest objektet det går i bane rundt, denne avstanden kalles forøvrig periapsis)
Hint: Man kan benytte Math klassen for å hjelpe til med noen av utregningene her. Math.pow() (denne tar en parameter for hva som skal opphøyes, og en parameter for hvor mange ganger verdien skal opphøyes), Math.cos() (denne tar verdi i radianer), og Math.toRadians() (konverterer grader til radianer) f.eks..

a) - Avstandsimplementasjon

1AU =149 597 871km. Velg en fornuftig måte å definere denne verdien i koden. Hint, hint: Denne verdien vil aldri endre seg.

Lag en metode for å regne ut avstanden, distanceToCentralBody(double degrees). Denne bør returnere avstanden i km. (Hvordan blir dette i forhold til formelen?)

b) - Avstandsutregning

I Main.java benytt distanceToCentralBody()-metoden, og finn avstand mellom Jorda og Sola ved 0, 90, 180, 270 og 360 graders vinkel.

Hvis du har implementert formelen og konverteringene riktig vil du få ca:

Earth has a distance of 147054707km to the Sun at 0 degrees
Earth has a distance of 149554637km to the Sun at 90 degrees
Earth has a distance of 152141034km to the Sun at 180 degrees
Earth has a distance of 149554637km to the Sun at 270 degrees
Earth has a distance of 147054707km to the Sun at 360 degrees

Merk at hvis du skriver ut disse tallene direkte vil du få de et format som 1.47054707E8. Dette er også OK.



Oppgave 2.7 - Hastighet (Du skal gjøre et forsøk på denne)

Vi ønsker også å finne hastigheten til en naturlig satelitt. Dette kan vi benytte den underliggende formelen til.

orbiting_velocity_formula.png

v = hastigheten i m/s
G = Gravitational constant (den fra oblig 2: 6.67408E-11)
M = massen til "central celestial body" i kg, altså objektet den naturlige satelitten sirkler rundt
r = avstanden i meter
a) - Hastighetsimplementasjon

Lag en metode for å regne ut hastigheten orbitingVelocity(double distance). Denne skal returnere hastighet i km/s. Det vil si at det må gjøres en konvertering fra formelen, som returnerer hastighet i m/s.

For kvadratrot-utregning i Java, kan du benytte Math.sqrt().

b) - Hastighetsutregning

I Main.java benytt denne metoden, og finn hastigheten til Jorda ved 0, 45, 90, 135 og 180 graders vinkel. (Merk at disse IKKE er de samme gradene som i Oppgave 2.5.b)

Hvis du har implementert formelen og konverteringene riktig vil du få ca:

At a distance of 147054707km, Earth has a velocity of 30.04km/s
At a distance of 147778223km, Earth has a velocity of 29.97km/s
At a distance of 149554637km, Earth has a velocity of 29.79km/s
At a distance of 151374279km, Earth has a velocity of 29.61km/s
At a distance of 152141035km, Earth has a velocity of 29.54km/s

Hvis du skriver ut disse tallene direkte vil du få de et format som 1.47054707E8. Dette er også OK.

Bonusoppgaver
Bonusoppgave 3.1 - Hastighet 2.0

Lag en alternativ metode (med nytt navn) for orbitingVelocity(), som returnere hastigheten i m/s fremfor km/s.

Hvordan kan du ha disse to metodene med minst mulig duplisert kode?

Bonusoppgave 3.2 - Jordavstand

I Main.java benytt distanceToCentralBody().metoden, og finn maksimum og minimum avstand mellom jorda og sola i løpet av ett år, med en nøyaktighet på 1 dag.

Klarer du å generalisere dette med metode(r), slik at vi kan gjøre dette for hvilken som helst-planet? Å gå ut i fra en hel rotasjon (som ikke nødvendigvis vil si ett år på Jorda).

Earth has a maximum distance of 152140937km
Earth has a minimum distance of 147054707km

Bonusoppgave 3.3 - Trigonometri (Denne er vanskelig)

Finn avstand mellom Mars og Saturn etter 180 dager. Gitt at alle starter på 0 grader (periapsis), og at planetene da står på linje (dette er stemmer ikke med realiteten, men vi gjør det slik for oppgavens skyld).

Klarer du å generalisere dette med metode(r), slik at vi kan finne avstanden mellom to vilkårlige planeter etter ett visst antall dager?

The distance between Earth and Saturn at day 180 is 1502845457km
    </details>        
</body>
</html>