package p2;

/**
 * Zweite Aufgabe vom P-Blatt zu Lambda-Ausdrücken. Klasse prüft diverse
 * Bedingungen auf einem String-Array.
 * 
 * @author Lukas Struppek
 *
 */
public class WortFinder {
	/**
	 * Sucht in einem String-Array nach dem ersten Element, welches eine definierte
	 * Bedingung erfüllt.
	 * 
	 * @param str       String-Array mit zu prüfenden Werten
	 * @param bedingung Zu erfüllende Bedingung
	 * @return 1. Wert, der die Bedingung erfüllt. Ansonsten leerer String.
	 */
	public static String erstesWort(String[] str, Bedingung bedingung) {
		for (String s : str) {
			if (bedingung.trifftuZuAuf(s))
				return s;
		}
		return "";
	}

	public static void main(String[] args) {
		String[] woerter = TestDaten.erzeuge();
		/*
		 * Für String-Methoden siehe API:
		 * https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String
		 * .html
		 * 
		 * Auch hier könnten Anweisungen auch schrittweise und nicht verschachtelt
		 * umgesetzt werden.
		 */
		
		// Sucht erstes Wort, das mit 'A' beginnt
		System.out.print("1. Wort mit Anfangsbuchstabe A: ");
		System.out.println(erstesWort(woerter, s -> s.charAt(0) == 'A'));

		// Sucht erstes Wort, das 'au' enthält
		System.out.print("1. Wort, das 'au' enthält: ");
		System.out.println(erstesWort(woerter, s -> s.contains("au")));

		// Sucht erstes Wort, das auf 'suppe" endet
		System.out.print("1. Wort, das auf 'suppe' endet: ");
		System.out.println(erstesWort(woerter, s -> s.endsWith("suppe")));

		// Sucht erstes Wort mit der Länge 8
		System.out.print("1. Wort, das aus 8 Zeichen besteht: ");
		System.out.println(erstesWort(woerter, s -> s.length() == 8));
	}
}
