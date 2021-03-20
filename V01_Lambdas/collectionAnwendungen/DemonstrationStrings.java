package collectionAnwendungen;

import java.util.Arrays;
import java.util.List;

public class DemonstrationStrings {

	public static void main(String[] args) {
		List<String> liste = Arrays.asList("Hallo", "Welt", "!", "42");

		// Früher: externe Realisierung
		for (String s : liste)
			System.out.print(s + " ");
		System.out.println();
		
		// Mit Lambdas: interne Realisierung
		liste.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// Ersetzung aller Elemente mithilfe von Lambdas
		liste.replaceAll(s -> s.toUpperCase());
		liste.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// Sortierung aller Elemente
		liste.sort((a, b) -> a.length() - b.length());
		liste.forEach(s -> System.out.print(s + " "));

	}

}
