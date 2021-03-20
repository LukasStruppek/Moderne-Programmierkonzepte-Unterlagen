package einfuehrungsbeispiel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Klasse demonstriert die Anwendung von Lambda-Ausdr�cken anhand eines simplen
 * GUI-Beispiels. Erzeugt wird ein simples Frame, welches einen Button h�lt.
 * Beim Klick auf diesen Button wird ein entsprechender Z�hler erh�ht.
 * 
 * @author Lukas Struppek
 *
 */
public class CounterFrame extends JFrame {
	int counter = 0;
	JButton button = null;

	public CounterFrame() {
		button = new JButton("0");
		add(button);
		pack(); // Passt Gr��e des Frames an die Inhalte an
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Variante 1: Anonyme Klasse
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setText("" + ++counter);
			}
		};
		// Hinzuf�gen des ersten Listeners (anonyme Klasse)
		this.button.addActionListener(listener);
		// Entfernung des ersten Listeners, um den Lambda-Listener einzusetzen
		this.button.removeActionListener(listener);

		// Variante 2: Lambda-Ausdruck (neue Registrierung eines Listeneser)
		this.button.addActionListener(e -> button.setText("" + ++counter));
	}

	public static void main(String[] args) {
		CounterFrame frame = new CounterFrame();
	}

}
