package einfuehrungsbeispiel1;

/**
 * Klasse stellt eine Klassenmethode bereit, welche zwei double-Werte sowie ein
 * Objekt einer Unterklasse vom Typ MathFunction erwartet. Demonstriert den
 * Gedanken hinter Lambda-Ausdr�cken bzw. der �bergabe von Code in Form von
 * Variablen.
 * 
 * @author Lukas Struppek
 *
 */
public class Calculator {
	/**
	 * 
	 * @param a    Erste Zahl
	 * @param b    Zweite Zahl
	 * @param func Anzuwendende Implementierung von MathFunction
	 * @return R�ckgabe von func
	 */
	public static double applySomeMath(double a, double b, MathFunction func) {
		return func.doSomething(a, b);
	}
}
