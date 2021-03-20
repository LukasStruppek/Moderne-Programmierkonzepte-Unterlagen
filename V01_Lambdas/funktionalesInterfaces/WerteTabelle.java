package funktionalesInterfaces;

interface Funktion1p {
	double rechne(double a);
}

public class WerteTabelle {

	public static void tabelliere(String titel, Funktion1p f) {
		System.out.println("Tabelle für " + titel);
		System.out.println("\tx \tf(x)");
		for (int x = 0; x < 10; x++) {
			System.out.println("\t" + x + "\t" + f.rechne(x));
		}
	}

	public static void main(String[] args) {
		tabelliere("Quadrat", a -> a * a);
		tabelliere("Wurzel", b -> Math.sqrt(b));
	}

}
