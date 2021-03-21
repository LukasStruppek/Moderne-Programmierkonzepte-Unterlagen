package einfuehrungsbeispiel;

import java.util.stream.IntStream;

/**
 * Weitere Demonstration von Streams anhand eines IntStreams. Gezeigt wird
 * insbesondere, dass sich Stream-Objekte auch in Variablen speichern lassen und
 * sp�ter weitere Operationen angeh�ngt werden k�nnen. Intermediate Operationen
 * (Zwischenoperationen) wie map, filter, etc. werden erst beim Aufruf einer
 * Terminaloperation (Abschlussoperationen) wie sum() oder forEach() ausgef�hrt.
 * Man nennt dies lazy execution.
 *
 * @author Lukas Struppek
 *
 */
public class StreamDemonstrator2 {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 100); // Anlegen eines Streams der Zahlen 1 bis 99 (100 ist exklusive)
		is = is.map(x -> x + 2) // Alle Werte um 2 erh�hen
				.map(x -> x * x) // Alle Werte quadrieren
				.filter(x -> x % 3 == 0); // Behalte nur alle Vielfache von 3

		// Berechnung der Summe aller im Stream verbleibenden Elemente. Alle Operationen
		// werden erst mit dem Aufruf einer Terminaloperation wie sum() ausgef�hrt (lazy
		// execution).
		int summe = is.sum();
		System.out.println("Die Summe der Elemente im Stream ist " + summe);

	}

}
