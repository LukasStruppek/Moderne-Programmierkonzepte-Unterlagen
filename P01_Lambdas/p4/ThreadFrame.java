package p4;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Vierte Aufgabe vom P-Blatt zu Lambda-Ausdrücken. Es wird ein Frame mit drei
 * Buttons erzeugt. Die Erhöhung der Werte der Buttons wird von einem Thread
 * übernommen, der zufällig einen der Buttons auswählt. Prozess wird wiederholt,
 * bis ein Button den Wert 1000 errreicht hat.
 * 
 * @author Lukas Struppek
 *
 */

public class ThreadFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		/*
		 * Referenzen der Buttons werden in diesem Fall in einem Array
		 * zwischengespeichert, damit der Thread auf diese Referenzen direkt zugreifen
		 * kann. In der alternativen Implementierung werden die Referenzen nicht direkt
		 * zwischengespeichert.
		 */
		JButton[] buttons = new JButton[3];
		frame.setLayout(new GridLayout(1, 3));
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JButton("0");
			buttons[i].addActionListener(e -> {
				JButton source = (JButton) e.getSource();
				int counter = Integer.valueOf(source.getText());
				source.setText(++counter + "");
			});
			frame.add(buttons[i]);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);

		/*
		 * Implementierung eines Runnable-Interfaces als Lambda-Ausdruck. Runnables
		 * werden von Threads ausgeführt und bestimmen die Tätigkeit des Threads.
		 */
		Runnable r = () -> {
			// Endlosschleife
			while (true) {
				// Zufällige Auswahl eines Buttons [0, 1, 2]
				int button_number = (int) (Math.random() * 3);
				// Abruf und Inkrementierung des Labels des Buttons
				int button_counter = Integer.valueOf(buttons[button_number].getText());
				buttons[button_number].setText("" + ++button_counter);

				// Beendigung der Endlosschleife, wenn ein Button den Wert 1000 erreicht
				if (button_counter >= 1000)
					break;

				// 5ms Pause nach jedem Durchlauf
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		// Erzeugung eines neuen Threads zur Ausführung des Runnables
		Thread t1 = new Thread(r);
		// Starten des Threads, wodurch die run-Methode aufgerufen wird
		t1.start();
	}

}
