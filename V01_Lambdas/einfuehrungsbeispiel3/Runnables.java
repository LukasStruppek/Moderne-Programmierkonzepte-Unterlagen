package einfuehrungsbeispiel3;

/**
 * Klasse demonstriert den Einsatz von Lambda-Ausdrücken zur Implementierung von
 * Runnable-Interfaces im Kontext von Threads (parallele Programmierung). Bei
 * beiden Varianten wird ein Zähler von 0 bis 9 hochgezählt und jeweils der
 * aktuelle Zustand auf der Konsole ausgegeben. Ausgabereihenfolge kann von der
 * PC-Auslastung bzw. der PRozessorleistung variieren.
 * 
 * @author Lukas Struppek
 *
 */
public class Runnables {

	public static void main(String[] args) {
		// Variante 1: Anonyme Klasse
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println(i);
			}
		};

		// Variante 2: Lambda Ausdruck mit identischer Funktionalität
		Runnable r2 = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(i);
		};

		// Erzeugung und starten der beiden Threads
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
