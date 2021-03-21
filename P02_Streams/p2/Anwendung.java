package p2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
/**
 * Zweite Aufgabe vom P-Blatt zu Streams und Pipeline-Operationen.
 * 
 * @author Lukas Struppek
 *
 */

public class Anwendung {
	public static void main(String[] args) {
		List<Person> personen = TestPersonen.erzeuge();
		
		// a) Alle Personen ausgeben
		personen.stream().forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		// b) Alle Frauen ausgeben
		personen.stream()
		.filter(s -> s.geschlecht == 'w')
		.forEach(System.out::println);
		System.out.println();
		
		// c) Alle Männer, die nach 2300 gebohren sind, ausgeben
		personen.stream()
		.filter(s -> s.geschlecht == 'm')
		.filter(s -> s.gebJahr > 2300)
		.forEach(System.out::println);
		System.out.println();
		
		// d) Alle Personen, deren Vor- und Nachnamen mit demselben Bustaben beginnen
		personen.stream()
		.filter(s -> s.vorname.charAt(0) == s.nachname.charAt(0))
		.forEach(System.out::println);
		System.out.println();
		
		// e) Anzahl der Frauen ermitteln
		long counter = personen.stream()
		.filter(s -> s.geschlecht == 'w')
		.count();
		System.out.println("Anzahl Frauen: " + counter);
		System.out.println();
		
		// f) Durchschnittsalter aller Personen im Jahr 2400 ermitteln
		OptionalDouble avg = personen.stream()
		.mapToInt(s -> 2400 - s.gebJahr)
		.average();
		System.out.println("Durchschnittsalter im Jahr 2400: " + avg.getAsDouble());
		System.out.println();

		// g) Das späteste Geburtsjahr ermitteln
		OptionalInt geb = personen.stream()
				.mapToInt(s -> s.gebJahr)
				.max();
		System.out.println("Spätestes Geburtsjahr: " + geb.getAsInt());
		System.out.println();

		// h) Die älteste Person ermitteln
		personen.stream()
		.sorted((a, b) -> a.gebJahr - b.gebJahr)
		.limit(1)
		.forEach(System.out::println);
	}
}
