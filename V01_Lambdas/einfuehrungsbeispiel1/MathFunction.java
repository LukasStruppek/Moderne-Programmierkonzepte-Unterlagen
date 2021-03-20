package einfuehrungsbeispiel1;

/**
 * Einfaches funktionales Interface zur Demonstration von simplen
 * Lambda-Ausdr�cken. Funktionale Interfaces enthalten genau 1 abstrakte
 * Methode.
 * 
 * '@FunctionalInterface' l�sst den Compiler pr�fen, ob es sich tats�chlich um
 * ein funktionales Interface handelt. Dies hilft �hnlich wie '@override' Fehler
 * schon fr�hzeitig auszuschlie�en.
 * 
 * @author Lukas Struppek
 * 
 */
@FunctionalInterface
public interface MathFunction {
	// Methoden in Interfaces sind implizit public und abstract
	// double doSomething(double a, double b); w�re daher identisch
	public abstract double doSomething(double a, double b);
}
