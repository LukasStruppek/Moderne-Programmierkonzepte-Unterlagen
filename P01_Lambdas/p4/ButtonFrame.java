package p4;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Vierte Aufgabe vom P-Blatt zu Lambda-Ausdrücken. Es wird ein Frame mit drei
 * Buttons erzeugt. Beim Klick auf einen Button soll sich der Wert des Buttons
 * um 1 erhöhen.
 * 
 * @author Lukas Struppek
 *
 */
public class ButtonFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Grid-Layout mit 1 Zeile und 3 Spalten.
		frame.setLayout(new GridLayout(1, 3));
		for (int i = 0; i < 3; i++) {
			// Erzeuge neue Buttons mit Start-Label 0
			JButton b = new JButton("0");
			/*
			 * Definiere ActionListener als Lambda-Ausdruck und registriere diesen direkt
			 * auf dem jeweiligen Button. Lambda-Ausdruck könnte alternativ auch in einer
			 * Variable vom Typ ActionListener gespeichert werden.
			 */
			b.addActionListener(e -> {
				// Erhalte Referenz auf das Element, welches den Listener verwendet (JButton)
				JButton source = (JButton) e.getSource();
				// Rufe aktuellen Wert des Labels ab
				int counter = Integer.valueOf(source.getText());
				// Erhöhe den Wert des Labels um 1
				source.setText(++counter + "");
			});
			// Füge den Button auf das Frame hinzu
			frame.add(b);
		}
		// Beim Klick auf das 'X' wird das Programm beendet
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}
