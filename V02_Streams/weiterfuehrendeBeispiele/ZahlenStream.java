package weiterfuehrendeBeispiele;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Beispielhafte Anwendungen von Zwischen- und Abschlussoperatoren auf
 * Zahlenströme. Es empfiehlt sich auch stets der Blick in die Java API zur
 * genauen Funktionsweise der Methoden.
 * 
 * @author Lukas Struppek
 *
 */
public class ZahlenStream {

	public static int quersumme(Integer input) {
		int result = 0;
		while (input != 0) {
			result += input % 10;
			input = input / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		IntStream s1 = IntStream.rangeClosed(1, 100); // Stream mit Zahlen [1, 100]
		int summe = s1.filter(s -> s % 2 == 1) // Filtere alle geraden Zahlen heraus
				.limit(25) // Begrenze Stream auf 25 Elemente
				.map(s -> s * 2) // Verdoppele alle Werte
				.reduce(0, (total, element) -> total + element); // Berechnet Summe über reduce-Operation
		System.out.println("Summe der Elemente :" + summe);

		Stream<Integer> s2 = Stream.of(4, 1, 6, 77, 2, 5, 52, 114);
		OptionalDouble avg = s2.map(i -> quersumme(i)) // Ersetze jedes Element durch seine Quersumme
				.distinct() // Entferne alle doppelten Elemente im Stream
				.mapToInt(i -> i) // Wandel Stream<Integer> in IntStream um über Identitätsfunktion (i -> i)
				.average(); // Berechne Mittelwert (liefert OptionalDouble)

		if (avg.isPresent()) // Prüfe, ob OptionalDouble einen Wert enthält
			System.out.println("Durchschnitt der Elemente: " + avg.getAsDouble());
	}

}
