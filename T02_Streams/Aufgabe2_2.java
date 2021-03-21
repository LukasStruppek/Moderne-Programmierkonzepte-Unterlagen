import java.util.*;

/**
 * Zweite Aufgabe vom T-Blatt zu Streams und Pipeline-Operationen.
 * 
 * @author Lukas Struppek
 *
 */
public class Aufgabe2_2 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("bbb", "ZZZ", "aaa", "PPP", "zzz", "fff", "vvv");
		boolean i = strings.stream()
				.distinct()	// L�sche doppelte Elemente (hier nicht der Fall)
				.sorted((a, b) -> a.compareToIgnoreCase(b))	// Sortiere ohne Beachtung von Gro�- und Kleinschreibung
				.limit(4)	// Behalte nur die ersten vier Elemente
				.map((a) -> a.substring(0, 2))	// Ersetze jeden String durch einen Substring der ersten zwei Zeichen
				.noneMatch((a) -> a.equals("aa"));	// Pr�fe, ob keines der Elemente die Bedingung erf�llt
		System.out.println(i);
	}
}