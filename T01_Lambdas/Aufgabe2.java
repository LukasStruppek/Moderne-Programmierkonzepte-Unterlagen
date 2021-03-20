import java.util.function.*;

/**
 * Zweite Aufgabe vom T-Blatt zu Lambda-Ausdrücken.
 * 
 * @author Lukas Struppek
 *
 */
public class Aufgabe2 {
	public static void main(String[] args) {
		/*
		 * Typ von UnaryOperator wird als Integer festgelegt. Erlaubt Typsicherheit
		 * durch Compiler (-> Generics)
		 */
		UnaryOperator<Integer> op = a -> a * a;
		// Aufruf der Methode apply, definiert im Interface UnaryOperator
		Integer ergebnis = op.apply(5);
		System.out.println(ergebnis);
	}
}