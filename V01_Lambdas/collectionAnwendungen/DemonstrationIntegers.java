package collectionAnwendungen;

import java.util.Arrays;
import java.util.List;

/**
 * Klasse demonstriert die Neuerungen im Collection-Framework mit Java 8.
 * Mithilfe von forEach, replaceAll und sort in Kombination mit
 * LAmbda-Ausdr�cken lassen sich Elemente einer Collection schnell und
 * �bersichtlich manipulieren bzw. verarbeiten.
 * 
 * @author Lukas Struppek
 *
 */
public class DemonstrationIntegers {

	public static void main(String[] args) {
		// Arrays.asList erlaubt schnelle Erzeugung einer Liste inkl. Werten
		List<Integer> zahlen = Arrays.asList(1, 3, 6, 2, 7, 22, 7, 1);

		/*
		 * forEach erwartet eine Implementierung des Consumer-Interfaces. Anschlie�end
		 * wird die Methode auf alle Elemente der Collection angewandt (ersetzt keine
		 * Elemente in der Collection).
		 */
		zahlen.forEach(a -> System.out.print(a + " "));
		System.out.println();

		/*
		 * replaceAll erwartet eine Implementierung des UnaryOperator-Interfaces und
		 * wendet die Implementierung auf alle Elemente in der Collection an. Dabei
		 * werden die Elemente in der Collection ersetzt. Eine �nderung des Datentyps
		 * ist aufgrund von UnaryOperator (Input-Typ = R�ckgabe-Typ) nicht m�glich.
		 */
		zahlen.replaceAll(a -> a * a);
		zahlen.forEach(a -> System.out.print(a + " "));
		System.out.println();

		/*
		 * sort erwartet eine Implementierung des Comparator-Interfaces und erm�glicht
		 * die interne Sortierung einer Collection. Dieses nimmt zwei Parameter entgegen
		 * und liefert einen Integer zur�ck. Bei R�ckgabe eines negativen Wertes wird
		 * das erste Argument vor dem zweiten in der Liste angeordnet. Bei positiven
		 * Werten ist es entsprechend andersherum. Bei 0 sind beide Werte als gleich in
		 * der Reihenfolge angesehen.
		 */
		zahlen.sort((a, b) -> b - a);
		zahlen.forEach(a -> System.out.print(a + " "));
	}

}
