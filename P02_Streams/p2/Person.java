package p2;

/**
 * Zweite Aufgabe vom P-Blatt zu Streams und Pipeline-Operationen. Klasse ist
 * vorgegeben und modelliert Eigenschaften einer Person. Zugriff auf
 * Instanzvariablen kann direkt erfolgen, da diese nicht private sind.
 * 
 * @author Lukas Struppek
 *
 */

public class Person {
	int nr;
	String vorname;
	String nachname;
	int gebJahr;
	char geschlecht;

	public Person(String n, String vn, String nn, String gj, String g) {
		nr = Integer.parseInt(n);
		vorname = vn;
		nachname = nn;
		gebJahr = Integer.parseInt(gj);
		geschlecht = g.charAt(0);
	}

	public String toString() {
		return nr + ": " + vorname + " " + nachname + " (" + geschlecht + ") " + gebJahr;
	}
}
