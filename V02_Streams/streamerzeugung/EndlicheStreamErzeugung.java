package streamerzeugung;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Beispiele zur Erzeugung von endlichen Streams aus diversen Quellen
 * (Collections, Text-Dateien, etc.)
 * 
 * @author Lukas Struppek
 *
 */
public class EndlicheStreamErzeugung {

	public static void main(String[] args) throws FileNotFoundException {
		// Variante 1: Streams aus Collections
		List<Integer> liste = Arrays.asList(1, 45, 2, 6, 22);
		Stream<Integer> s1 = liste.stream();

		// Variante 2: Paralleler Stream aus Collection
		Stream<Integer> s2 = liste.parallelStream();

		// Variante 3: Über BufferedReader, z.B. aus Textdatei
		BufferedReader br = new BufferedReader(new FileReader("V01_Streams/streamerzeugung/words.txt"));
		Stream<String> s3 = br.lines();

		// Variante 4: Stream.of
		Stream<String> s4 = Stream.of("Hallo", "Welt", "!");

		// Variante 5: IntStream.range: Obere Grenze ist exklusive
		IntStream s5 = IntStream.range(1, 51);

		// Variante 6: LongStream.rangeClosed: Obere Grenze ist inklusive
		LongStream s6 = LongStream.rangeClosed(1, 50);
	}

}
