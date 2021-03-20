package funktionalesInterfaces;

/**
 * Funktionales Interface, welches eine Methode zur Verarbeitung zweier
 * double-Werte beinhaltet. Interface ist nicht public, um es zusammen mit der
 * Klasse Summation in einer Datei zu definieren.
 * 
 * @author Lukas Struppek
 *
 */
@FunctionalInterface
interface Funktion {
	public abstract double methode(double a, double b);
}

/**
 * Demonstration möglicher Implementierungen des funktionalen Interfaces
 * mithilfe von Lambda-Ausdrücken.
 * 
 * @author Lukas Struppek
 *
 */
public class Summation {
	public static void main(String[] args) {
		// Berechnung der Summe. Typangabe + return kann entfallen
		Funktion f = (a, b) -> a + b;
		// Berechnung des Quotienten. Tabangabe hier nur optional und könnte entfallen.
		Funktion g = (double a, double b) -> {
			return a / b;
		};

		// Aufruf der entsprechenden Methode
		System.out.println(f.methode(10, 5));
		System.out.println(g.methode(10, 5));
	}

}
