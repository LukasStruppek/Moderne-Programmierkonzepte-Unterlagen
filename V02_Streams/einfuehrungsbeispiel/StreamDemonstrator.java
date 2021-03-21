package einfuehrungsbeispiel;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstration zur Funktionsweise von Streams. Auf einer Collection k�nnen
 * beliebig viele Streams ge�ffnet werden. Dabei werden unabh�ngig von den
 * Operationen die in der Collection gehaltenen Daten nicht ge�ndert. Zur
 * �nderung der Daten in den Collections m�ssen entsprechende Methoden (z.B.
 * replaceAll) direkt auf der Collection angewandt werden.
 * 
 * @author Lukas Struppek
 *
 */
public class StreamDemonstrator {

	public static void main(String[] args) {
		List<String> speisen = Arrays.asList("Pizza", "D�ner", "Curry", "Bier", "Bockwurst", "Maultaschen");

		// Stream 1
		speisen.stream() // Anlegen des Streams
				.filter(s -> s.length() > 4) // Elemente mit 4 oder weniger Buchstaben werden herausgefiltert
				.map(s -> s.toUpperCase()) // Alle Buchstaben in Gro�buchstaben umwandeln
				.filter(element -> !element.contains("�")) // Entferne alle Elemente, die ein '�' enthalten
				.sorted() // Sortiert standardm��ig aufsteigend (A, B, C,..., a, b, c, ...)
				.forEach(s -> System.out.println(s)); // Alle verbleibenden Elemente werden ausgegeben
		System.out.println();

		// Stream 2
		speisen.stream() // Anlegen des Streams
				.map(s -> s.substring(1)) // Entferne das erste Zeichen in jedem W�rt
				.sorted((a, b) -> b.length() - a.length()) // Nach absteigender L�nge sortieren
				.filter(s -> !s.endsWith("r")) // Entferne Elemente, die auf "r" enden
				.forEach(System.out::println); // Alle verbleibenden Elemente werden ausgegeben
	}

}
