package weiterfuehrendeBeispiele;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Erzeugung von Arrays bzw. Listen der 2er Potenzen mithilfe von Streams.
 * Streams ermöglichen eine elegante Lösung, um Arrays oder Collections mit
 * Werten zu füllen, die einer gewissen Logik folgen.
 * 
 * @author Lukas Struppek
 *
 */
public class ZweierPotenzen {

	public static void main(String[] args) {
		/*
		 * Erzeuge ein int-Array mit den ersten 15 2er-Potenzen
		 */
		int[] potenzen1 = IntStream.iterate(1, i -> i * 2).limit(15).toArray();

		/*
		 * Erzeuge eine Integer-Liste mit den ersten 15 2er-Potenzen
		 */

		List<Integer> potenzen2 = IntStream.iterate(1, i -> i * 2).limit(15).mapToObj(Integer::valueOf) // int-Werte
																										// müssen in
																										// Objekte
																										// (Integer)
																										// umgewandelt
																										// werden
				.collect(Collectors.toList()); // Verwendung der vordefinierten Collectors.toList Methode

		// Ausgabe aller Werte im Array
		for (int i : potenzen1) {
			System.out.println(i);
		}
		System.out.println();

		// Ausgabe aller Werte in der Liste
		potenzen2.forEach(System.out::println);
	}

}
