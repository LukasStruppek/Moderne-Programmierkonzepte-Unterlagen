package einfuehrungsbeispiel1;

/**
 * 
 * Vergleicht und demonstriert die verschiedenen Varianten, wie Interfaces
 * implementiert werden können. Alle Varianten implementieren die Berechnung des
 * 
 * @author Lukas Struppek
 *
 */
public class Hauptklasse {

	public static void main(String[] args) {
		// Erzeugung eines Calculator-Objekts
		Calculator calc = new Calculator();
		double zahl1 = 3.14;
		double zahl2 = 42;
		double result = 0.0;

		/*
		 * Variante 1: Eine Klasse implementiert das Inferface MathFunction über
		 * 'implements' und fügt der abstrakten Methode eine Funktionalität hinzu über
		 * einen Methodenrumpf.
		 */
		MathKlasse f1 = new MathKlasse();
		result = calc.applySomeMath(zahl1, zahl2, f1);
		System.out.println(result);

		/*
		 * Variante 2: Eine anonyme Klasse wird erzeugt, welche im Objekt f2 gespeichert
		 * wird. Somit muss im Vergleich zu Variante 1 keine vollständige separate
		 * Klasse definiert werden.
		 */
		MathFunction f2 = new MathFunction() {
			@Override
			public double doSomething(double a, double b) {
				return (a + b) / 2.0;
			}
		};
		result = calc.applySomeMath(zahl1, zahl2, f2);
		System.out.println(result);

		/*
		 * Variante 3: Ein Lambda-Ausdruck stellt hier die eleganteste Lösung dar.
		 * Verglichen mit den anderen beiden Varianten ist die Implementierung der
		 * Funktionalität knapp und übersichtlich. Der Code wird kürzer, lesbarer und
		 * übersichtlicher. Wichtig: Lambda-Ausdrücke können nur über funktionalen
		 * Interfaces erzeugt werden, also Interfaces, die exakt 1 abstrakte Methode
		 * enthalten (sowie beliebig viele default und static Methoden enthalten
		 * dürfen).
		 */
		MathFunction f3 = (double c, double d) -> (c + d) / 2;
		// Alternativ ohne explizite Typangabe: MathFunction f4 = (c, d) -> (c + d) / 2;
		// Alternative mit return: MathFunction f5 = (a, b) -> {return (a + b) / 2;};
		result = calc.applySomeMath(zahl1, zahl2, f3);
		System.out.println(result);
	}

}
