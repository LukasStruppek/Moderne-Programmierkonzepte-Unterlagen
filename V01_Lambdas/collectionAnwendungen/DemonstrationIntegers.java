package collectionAnwendungen;

import java.util.Arrays;
import java.util.List;

/**
 * Klasse demonstriert die Neuerungen im Collection-Framework mit Java 8.
 * Mithilfe von forEach, replaceAll und sort in Kombination mit
 * LAmbda-Ausdrücken lassen sich Elemente einer Collection schnell und
 * übersichtlich manipulieren bzw. verarbeiten.
 * 
 * @author Lukas Struppek
 *
 */
public class DemonstrationIntegers {

	public static void main(String[] args) {
		// Arrays.asList erlaubt schnelle Erzeugung einer Liste inkl. Werten
		List<Integer> zahlen = Arrays.asList(1, 3, 6, 2, 7, 22, 7, 1);

		/*
		 * forEach erwartet eine Implementierung des Consumer-Interfaces. Anschließend
		 * wird die Methode auf alle Elemente der Collection angewandt (ersetzt keine
		 * Elemente in der Collection).
		 */
		zahlen.forEach(a -> System.out.print(a + " "));
		System.out.println();

		/*
		 * replaceAll erwartet eine Implementierung des UnaryOperator-Interfaces und
		 * wendet die Implementierung auf alle Elemente in der Collection an. Dabei
		 * werden die Elemente in der Collection ersetzt. Eine Änderung des Datentyps
		 * ist aufgrund von UnaryOperator (Input-Typ = Rückgabe-Typ) nicht möglich.
		 */
		zahlen.replaceAll(a -> a * a);
		zahlen.forEach(a -> System.out.print(a + " "));
		System.out.println();

		/*
		 * sort erwartet eine Implementierung des Comparator-Interfaces und ermöglicht
		 * die interne Sortierung einer Collection. Dieses nimmt zwei Parameter entgegen
		 * und liefert einen Integer zurück. Bei Rückgabe eines negativen Wertes wird
		 * das erste Argument vor dem zweiten in der Liste angeordnet. Bei positiven
		 * Werten ist es entsprechend andersherum. Bei 0 sind beide Werte als gleich in
		 * der Reihenfolge angesehen.
		 */
		zahlen.sort((a, b) -> b - a);
		zahlen.forEach(a -> System.out.print(a + " "));
	}

}
