import java.util.*;

/**
 * Erste Aufgabe vom T-Blatt zu Streams und Pipeline-Operationen.
 * 
 * @author Lukas Struppek
 *
 */
public class Aufgabe2_1 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("bb", "ZZ", "aa", "PP", "zz");
		strings.stream()
		.sorted()	// Sortiere nach nat�rlicher Ordnung (Gro�buchstaben vor Kleinbuchstaben in Unicode)
		.map(String::toUpperCase)	// Wandle alle Elemente in Gro�buchstaben um
		.forEach(n -> System.out.print(n + " "));
	}
}