import java.util.*;

/**
 * Erste Aufgabe vom T-Blatt zu Lambda-Ausdrücken.
 * 
 * @author Lukas Struppek
 *
 */
public class Aufgabe1_1 {
	public static void main(String[] args) {
		List<Double> zahlen = Arrays.asList(1.0, 2.5, 3.5, 1.1, 2.2);
		// 1. Ersetzen Sie alle Einträge durch Zufallswerte
		zahlen.replaceAll(a -> Math.random());
		
		// 2. Sortieren Sie diese aufsteigend nach ihrem Wert
		// Lambda-Ausdruck muss int-Wert zurückliefern (siehe API Comparator)
		zahlen.sort((a, b) -> a.compareTo(b));
		// Alternative mit Methodenreferenz: 
		// zahlen.sort(Double::compare);
		
		// 3. Geben Sie die Liste auf der Konsole aus
		zahlen.forEach(a -> System.out.println(a));
		// Alternative mit Methodenreferenz
		// zahlen.forEach(System.out::println);
	}
}