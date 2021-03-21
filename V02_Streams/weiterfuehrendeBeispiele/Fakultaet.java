package weiterfuehrendeBeispiele;

import java.util.stream.LongStream;

/**
 * Berechnung der Fakult�t mithilfe eines LongStreams.
 * 
 * @author Lukas Struppek
 *
 */
public class Fakultaet {

	public static void main(String[] args) {
		int n = 10;
		LongStream s1 = LongStream.rangeClosed(1, 10);
		long fak = s1.reduce(1, (total, current) -> total * current);
		System.out.println("Fakult�t von " + n + " ist " + fak);
	}

}
