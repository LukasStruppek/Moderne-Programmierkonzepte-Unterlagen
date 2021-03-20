package einfuehrungsbeispiel1;

/**
 * Einfaches funktionales Interface zur Demonstration von simplen
 * Lambda-Ausdrücken. Funktionale Interfaces enthalten genau 1 abstrakte
 * Methode.
 * 
 * '@FunctionalInterface' lässt den Compiler prüfen, ob es sich tatsächlich um
 * ein funktionales Interface handelt. Dies hilft ähnlich wie '@override' Fehler
 * schon frühzeitig auszuschließen.
 * 
 * @author Lukas Struppek
 * 
 */
@FunctionalInterface
public interface MathFunction {
	// Methoden in Interfaces sind implizit public und abstract
	// double doSomething(double a, double b); wäre daher identisch
	public abstract double doSomething(double a, double b);
}
