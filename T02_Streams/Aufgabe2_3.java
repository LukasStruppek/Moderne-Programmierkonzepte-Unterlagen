import java.util.*;

/**
 * Dritte  Aufgabe vom T-Blatt zu Streams und Pipeline-Operationen.
 * 
 * @author Lukas Struppek
 *
 */
public class Aufgabe2_3 {
	public static void main(String[] args) {
		List<Integer> intArray = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
		intArray.stream()
		.filter(s -> s % 2 == 0)	// Filtere alle ungeraden Zahlen heraus
		.sorted()	// Sortiere aufsteigend nach Wert
		.forEach(System.out::println);
		
		/*
		 * Möglichkeit 2: Komplexere Lösung
		 */
		List<Integer> intArray2 = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
		intArray.stream()
		.skip(4)	// Erste vier Elemente werden übersprungen
		.map(s -> 8 - 2*s)		// Ersetze jedes Element durch (8-2*element)
		.forEach(System.out::println);	}
}