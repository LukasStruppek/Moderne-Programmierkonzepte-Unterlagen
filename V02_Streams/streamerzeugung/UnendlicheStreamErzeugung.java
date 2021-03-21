package streamerzeugung;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Demonstration zum Umgang mit unendlichen Streams. Wichtig ist die Begrenzung
 * der Datenströme über limit(), damit die Daten korrekt verarbeitet werden
 * können.
 * 
 * @author Lukas Struppek
 *
 */
public class UnendlicheStreamErzeugung {

	public static void main(String[] args) {
		// Variante 1: Stream.generate()
		Stream<Double> s1 = Stream.generate(Math::random);
		// Variante 2: ohne Methodenreferenz
		Stream<Double> s2 = Stream.generate(() -> Math.random());

		// Variante 3: Stream.iterate, startet bei einem Wert (seed=1) und wendet
		// wiederholt die angegebene Operation an
		Stream<Integer> s3 = Stream.iterate(1, x -> x * 2);

		// Variante 4: Stream.iterate für Double-Werte, seed (99.0) legt Datentyp fest
		Stream<Double> s4 = Stream.iterate(99.0, Math::sqrt);

		// Variante 5: DoubleStream.iterate legt direkt fest, dass es sich um
		// Double-Werte handelt
		DoubleStream s5 = DoubleStream.iterate(99.0, i -> Math.sqrt(i));
	}

}
