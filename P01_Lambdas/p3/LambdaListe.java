package p3;

import java.util.Arrays;
import java.util.List;

/**
 * Dritte Aufgabe vom P-Blatt zu Lambda-Ausdrücken. Demonstration der
 * Collection-Funktionen forEach und sort.
 * 
 * @author Lukas Struppek
 *
 */
public class LambdaListe {
	public static void main(String[] args) {
		// Erzeuge eine Liste mit Zahlen vom Typ Integer
		List<Integer> liste = Arrays.asList(11, 21, 24, 36, 41, 55, 62, 66);

		// Drucke alle Elemente aus dem Feld aus
		liste.forEach(a -> System.out.print(a + " "));
		System.out.println();

		// Sortiere Werte nach ihrem Rest der Division durch 8
		liste.sort((a, b) -> (a % 8) - (b % 8));

		// Drucke alle Elemente aus dem sortierten Feld aus
		liste.forEach(a -> System.out.print(a + " "));

	}
}