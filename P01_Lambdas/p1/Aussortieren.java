package p1;

/**
 * Erste Aufgabe vom P-Blatt zu Lambda-Ausdr�cken.
 * 
 * @author Lukas Struppek
 *
 */
public class Aussortieren {
	/**
	 * Wendet eine Pr�fung auf alle Elemente eines int-Arrays an.
	 * 
	 * @param ia   Zu pr�fendes Array
	 * @param prfg Bedingung
	 * @return Array mit allen Elementen aus ia, welche prfg erf�llen
	 */
	public static int[] reduziertesArray(int[] ia, Pruefung prfg) {
		// Z�hle die Anzahl an Elementen, welche prfg erf�llen
		int num_corrects = 0;
		for (int zahl : ia)
			if (prfg.istErfolgreichFuer(zahl))
				num_corrects++;

		// Erzeuge leeres Array mit Gr��e num_corrects
		int[] result = new int[num_corrects];

		// Kopiere alle Elemente aus ia, die prfg erf�llen, in result-Array.
		int zaehler = 0;
		for (int zahl : ia)
			if (prfg.istErfolgreichFuer(zahl)) {
				result[zaehler] = zahl;
				zaehler++;
			}

		return result;
	}

	/**
	 * Druckt alle Elemente eines Arrays in einer Zeile auf die Konsole.
	 * 
	 * @param text Bezeichnung des Arrays
	 * @param ia   Zu druckendes Array
	 */
	public static void ausgabe(String text, int[] ia) {
		System.out.print(text + ": ");
		// verk�rzte for-Schleife zum schrittweisen Abrufen aller Elemente aus ia
		// Lies: F�r alle Elemente i aus dem Array ia
		for (int i : ia) {
			System.out.print(i + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] feld = new int[30];
		for (int i = 0; i < feld.length; i++)
			// Erzeuge Zufallszahlen aus dem Bereich [-100, 100]
			feld[i] = (int) (Math.random() * 201 - 100);

		/*
		 * Methodenaufurfe k�nnen auch ohne Verschachtelung schrittweise aufgerufen
		 * werden. Ergebniss aus reduziertesArray m�ssten dann entsprechend in einer
		 * Variablen zwischengespeichert werden. Beim verschachtelten Aufruf wird
		 * zun�chst die Methode reduziertesArray ausgewertet, die selbst ein Array
		 * zur�ckliefert. Dieses Array wird anschlie�end von der Methode ausgabe
		 * verarbeitet und deren Inhalt auf die Konsole geschrieben.
		 */

		ausgabe("alle", feld);
		/*
		 * Pr�fung ist nicht notwendig. Pr�fung w�re hier Tautologie (immer wahr)
		 * ausgabe("alle", reduziertesArray(feld, a -> true));
		 */

		/*
		 * Filtern aller negativer Werte in ausf�hrlicher und kompakter Form.
		 */
		Pruefung negativ_test = (int a) -> a < 0;
		int[] result_array = reduziertesArray(feld, negativ_test);
		ausgabe("negative", result_array);
		ausgabe("negative", reduziertesArray(feld, a -> a < 0));

		/*
		 * Filtern aller geraden Zahlen mithilfe des Modulo-Operators %. Eine Zahl ist
		 * genau dann gerade, wenn der Rest der Division durch 2 gleich 0 ist.
		 */
		ausgabe("gerade", reduziertesArray(feld, a -> a % 2 == 0));

		/*
		 * Filtern aller Vielfachen von 7. Auch hier hilft der Modulo: Eine Zahl ist
		 * genau dann ein Vielfaches von 7, wenn der Rest der Division durch 7 gleich 0
		 * ist.
		 */
		ausgabe("7-fache", reduziertesArray(feld, a -> a % 7 == 0));

		/*
		 * Zur Pr�fung, ob eine Zahl eine Quadratzahl ist, wird hier gepr�ft, ob die
		 * Wurzel der Zahl keine Dezimalstellen besitzt. Praktisch umgesetzt wird dies,
		 * indem gepr�ft wird, ob die Zahl restlos durch 1 teilbar ist. Achtung, bei
		 * Flie�punktzahlen kann es zu Ungenauigkeiten kommen, sodass ein winzig-kleiner
		 * Dezimalanteil besteht. Entsprechend k�nnte dort der Test f�lschlicherweise
		 * eine Quadratzahl nicht erkennen.
		 */
		ausgabe("quadratische", reduziertesArray(feld, a -> Math.sqrt(a) % 1 == 0));
	}
}
