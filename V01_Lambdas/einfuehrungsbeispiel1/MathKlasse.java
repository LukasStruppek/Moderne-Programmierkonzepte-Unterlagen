package einfuehrungsbeispiel1;

/**
 * Demonstriert die klassische Variante zur Implementierung von Interfaces in
 * Klassen, welche dieses implementieren.
 * 
 * @author Lukas Struppek
 *
 */
public class MathKlasse implements MathFunction {
	/**
	 * �berschreibt die Methode doSomething aus dem Interface MathFunction.
	 * 
	 * '@Override' ist optional, sicher aber durch den Compiler zu, dass eine
	 * �berschreibung der Methode doSomething vorliegt. Verhindert daher falsche
	 * �berschreibungen wie z.B. das ungewollte �berladen von Methoden.
	 */
	@Override
	public double doSomething(double a, double b) {
		return (a + b) / 2;
	}

}
