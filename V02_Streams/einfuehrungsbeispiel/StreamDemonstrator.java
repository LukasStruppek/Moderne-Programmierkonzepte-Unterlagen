package einfuehrungsbeispiel;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstration zur Funktionsweise von Streams. Auf einer Collection können
 * beliebig viele Streams geöffnet werden. Dabei werden unabhängig von den
 * Operationen die in der Collection gehaltenen Daten nicht geändert. Zur
 * Änderung der Daten in den Collections müssen entsprechende Methoden (z.B.
 * replaceAll) direkt auf der Collection angewandt werden.
 * 
 * @author Lukas Struppek
 *
 */
public class StreamDemonstrator {

	public static void main(String[] args) {
		List<String> speisen = Arrays.asList("Pizza", "Döner", "Curry", "Bier", "Bockwurst", "Maultaschen");

		// Stream 1
		speisen.stream() // Anlegen des Streams
				.filter(s -> s.length() > 4) // Elemente mit 4 oder weniger Buchstaben werden herausgefiltert
				.map(s -> s.toUpperCase()) // Alle Buchstaben in Großbuchstaben umwandeln
				.filter(element -> !element.contains("Ö")) // Entferne alle Elemente, die ein 'Ö' enthalten
				.sorted() // Sortiert standardmäßig aufsteigend (A, B, C,..., a, b, c, ...)
				.forEach(s -> System.out.println(s)); // Alle verbleibenden Elemente werden ausgegeben
		System.out.println();

		// Stream 2
		speisen.stream() // Anlegen des Streams
				.map(s -> s.substring(1)) // Entferne das erste Zeichen in jedem Wört
				.sorted((a, b) -> b.length() - a.length()) // Nach absteigender Länge sortieren
				.filter(s -> !s.endsWith("r")) // Entferne Elemente, die auf "r" enden
				.forEach(System.out::println); // Alle verbleibenden Elemente werden ausgegeben
	}

}
