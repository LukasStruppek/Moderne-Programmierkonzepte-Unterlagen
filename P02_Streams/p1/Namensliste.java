package p1;

import java.util.Arrays;
import java.util.List;
/**
 * Erste Aufgabe vom P-Blatt zu Streams und Pipeline-Operationen.
 * 
 * @author Lukas Struppek
 *
 */

public class Namensliste {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alfons", "Rocko", "Willhelm", "Henrietta", "Heidrun", "Leonie");
		
		// a) Alle Namen, die mit H beginnen alphabetisch sortiert
		list.stream()
		.filter(s -> s.startsWith("H"))
		.sorted()
		.forEach(s -> System.out.print(s + " "));
				
		System.out.println();
		
		// b) Namen der Länge nach aufsteigend sortiert, wobei Länge > 5 sein muss
		list.stream()
		.sorted((a, b) -> a.length() - b.length())
		.filter(s -> s.length() > 5)
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		// c) Vier Namen in umgekehrter Reihenfolge, d.h. erster Buchstabe ist der letzte und umgekehrt
		list.stream()
		.map(s -> {
			String result = "";
			for(int i = s.length() - 1; i >= 0; i--)
				result += s.charAt(i);
			return result;
		})
		.limit(4)
		.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		// d) Ersetze Namen durch ihre Länge und lösche doppelte Werte. Aus den restlichen wird die Summe berechnet
		int summe = list.stream()
		.map(s -> s.length())
		.distinct()
		.mapToInt(s -> Integer.valueOf(s))
		.sum();
		System.out.println(summe);
	}

}
