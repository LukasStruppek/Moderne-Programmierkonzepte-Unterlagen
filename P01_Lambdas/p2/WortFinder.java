package p2;

/**
 * Zweite Aufgabe vom P-Blatt zu Lambda-Ausdr�cken. Klasse pr�ft diverse
 * Bedingungen auf einem String-Array.
 * 
 * @author Lukas Struppek
 *
 */
public class WortFinder {
	/**
	 * Sucht in einem String-Array nach dem ersten Element, welches eine definierte
	 * Bedingung erf�llt.
	 * 
	 * @param str       String-Array mit zu pr�fenden Werten
	 * @param bedingung Zu erf�llende Bedingung
	 * @return 1. Wert, der die Bedingung erf�llt. Ansonsten leerer String.
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
		 * F�r String-Methoden siehe API:
		 * https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String
		 * .html
		 * 
		 * Auch hier k�nnten Anweisungen auch schrittweise und nicht verschachtelt
		 * umgesetzt werden.
		 */
		
		// Sucht erstes Wort, das mit 'A' beginnt
		System.out.print("1. Wort mit Anfangsbuchstabe A: ");
		System.out.println(erstesWort(woerter, s -> s.charAt(0) == 'A'));

		// Sucht erstes Wort, das 'au' enth�lt
		System.out.print("1. Wort, das 'au' enth�lt: ");
		System.out.println(erstesWort(woerter, s -> s.contains("au")));

		// Sucht erstes Wort, das auf 'suppe" endet
		System.out.print("1. Wort, das auf 'suppe' endet: ");
		System.out.println(erstesWort(woerter, s -> s.endsWith("suppe")));

		// Sucht erstes Wort mit der L�nge 8
		System.out.print("1. Wort, das aus 8 Zeichen besteht: ");
		System.out.println(erstesWort(woerter, s -> s.length() == 8));
	}
}
