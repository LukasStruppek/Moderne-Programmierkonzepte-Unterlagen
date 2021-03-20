package vordefinierteInterfaces;

import java.util.function.*;

/**
 * Demonstration zur Implementierung diverser funktionaler Interfaces, die im
 * Package java.util.function definiert sind. Die Interfaces werden stark in der
 * Stream API eingesetzt. Datentypen der Parameter sowie Rückgabewert werden
 * jeweils bei der Variablendeklaration definiert (-> Generics)
 * 
 * @author Lukas Struppek
 *
 */
public class ExemplarischeImplementierungen {

	public static void main(String[] args) {
		/*
		 * (Bi)Function: Nimmt Wert(e) entgegen und liefert einen Wert zurück
		 * f1: Multipliziere Input mit 5 
		 * f2: Caste einen String in Großbuchstaben 
		 * f3: Berechne die Summe aus zwei Integern
		 */
		Function<Double, Double> f1 = a -> 5 * a;
		System.out.println(f1.apply(10.0));

		Function<String, String> f2 = s -> s.toUpperCase();
		System.out.println(f2.apply("Hallo Welt"));

		BiFunction<Integer, Integer, Integer> f3 = (b, c) -> b + c;
		System.out.println(f3.apply(3, 5));

		/* Consumer: Nimmt Wert(e) entgegen, liefert aber keinen Wert zurück
		 * c1: Druckt einen übergebenen String zweimal hintereinander aus
		 * c2: Druckt einen String a-Mal auf der Konsole aus
		 */
		Consumer<String> c1 = s -> System.out.println(s + s);
		c1.accept("Hallo ");
		
		// { } notwendig, da mehrzeilige Anweisung
		BiConsumer<Integer, String> c2 = (a, b) -> {
			for (int i = 0; i < a; i++)
				System.out.println(b);
		};
		c2.accept(5, "Hallo");

		/* Predicate: Nimmt Wert(e) entgegen und liefert ein boolesches Ergebnis zurück
		 * p1: Prüft, ob ein Argument nicht-negativ ist
		 */
		Predicate<Integer> p1 = a -> a >= 0;
		System.out.println(p1.test(42));

		/* Supplier: Liefert einen Wert zurück ohne Input
		 * s1: Liefert eine ganzzahlige Zufallszahl im Bereich [1, 10]
		 */
		Supplier<Integer> s1 = () -> (int) (Math.random() * 10 + 1);
		System.out.println(s1.get());

		/*
		 * UnaryOperator: Nimmt Wert von Typ T entgegen und liefert Ergebnis vom Typ T
		 * u1: Multipliziert Argument mit 100
		 */
		UnaryOperator<Long> u1 = a -> 100 * a;
		System.out.println(u1.apply(10L));

		/* BinaryOperator: Wie UnaryOperator, nimmt aber zwei Argumente vom Typ T entgegen
		 * b1: Berechnet Produkt aus zwei Werten
		 */
		BinaryOperator<Integer> b1 = (a, b) -> a * b;
		System.out.println(b1.apply(3, 4));
	}

}
