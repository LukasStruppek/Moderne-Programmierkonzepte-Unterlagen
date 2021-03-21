package p3;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Dritte Aufgabe vom P-Blatt zu Streams und Pipeline-Operationen. Im Fokus
 * stehen unendliche Zahlenströme.
 * 
 * @author Lukas Struppek
 *
 */

public class Schulnoten {

	public static void main(String[] args) {
		// a) Unendlicher Zahlenstrom aller natürlichen geraden Zahlen (2, 4, 6, ...)
		IntStream zahlen = IntStream.iterate(2, i -> i + 2);

		// b) Erste 8 Elemente aus dem Stream aus a) werden ausgegeben
		zahlen.limit(8).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// c) Die Summe der ersten 20 durch 3 teilbaren ungeraden Zahlen
		int summe = IntStream.iterate(3, i -> i + 3).filter(i -> i % 3 == 0 & i % 2 == 0).limit(20).sum();
		System.out.println("Summe: " + summe);

		// d) Erzeugung von 10 zufälligen Schulnoten (1 - 6)
		IntStream.generate(() -> (int) (Math.random() * 6) + 1).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// e) Berechnung der Durschnittsnote aller Noten <= 4 für 100 zufällige Schulnoten
		OptionalDouble avg = IntStream.generate(() -> (int) (Math.random() * 6) + 1).limit(100).filter(i -> i <= 4)
				.average();
		System.out.println("Durchschnittsnote: " + avg.getAsDouble());
	}

}
