package p2;

import java.util.List;
import java.util.ArrayList;

/**
 * Zweite Aufgabe vom P-Blatt zu Streams und Pipeline-Operationen. Die Klasse
 * erzeugt eine Liste mit Testpersonen, welche für die Aufgaben verwendet wird.
 * 
 * @author Lukas Struppek
 *
 */

public class TestPersonen {
	public static List<Person> erzeuge() {
		List<Person> tpl = new ArrayList<Person>();
		tpl.add(new Person("1", "James T.", "Kirk", "2228", "m"));
		tpl.add(new Person("2", "Spock", "-", "2230", "m"));
		tpl.add(new Person("3", "Leonard", "McCoy", "2227", "m"));
		tpl.add(new Person("4", "Jean-Luc", "Picard", "2305", "m"));
		tpl.add(new Person("5", "Geordi", "La Forge", "2335", "m"));
		tpl.add(new Person("6", "Worf", "-", "2340", "m"));
		tpl.add(new Person("7", "Deanna", "Troi", "2336", "w"));
		tpl.add(new Person("8", "Beverly", "Crusher", "2324", "w"));
		tpl.add(new Person("9", "Benjamin", "Sisko", "2332", "m"));
		tpl.add(new Person("10", "Julian", "Bashir", "2341", "m"));
		tpl.add(new Person("11", "Kathryn", "Janeway", "2335", "w"));
		tpl.add(new Person("12", "Chakotay", "-", "2329", "m"));
		tpl.add(new Person("13", "Tuvok", "-", "2264", "m"));
		tpl.add(new Person("14", "Tom", "Paris", "2340", "m"));
		tpl.add(new Person("15", "B'Elana", "Torres", "2349", "w"));
		tpl.add(new Person("16", "Harry", "Kim", "2349", "m"));
		tpl.add(new Person("17", "Seven", "of Nine", "2348", "w"));
		tpl.add(new Person("18", "Samantha", "Wildman", "2348", "w"));
		tpl.add(new Person("19", "Naomi", "Wildman", "2372", "w"));
		tpl.add(new Person("20", "Jonathan", "Archer", "2112", "m"));
		tpl.add(new Person("21", "Hoshi", "Sato", "2129", "w"));
		tpl.add(new Person("22", "Michael", "Burnham", "2226", "w"));
		tpl.add(new Person("23", "Nyota", "Uhura", "2223", "w"));
		tpl.add(new Person("24", "Pavel", "Chekov", "2245", "m"));
		tpl.add(new Person("25", "William T.", "Riker", "2335", "m"));
		tpl.add(new Person("26", "Tasha", "Yar", "2337", "w"));
		tpl.add(new Person("27", "Zefram", "Cochrane", "2032", "m"));
		tpl.add(new Person("28", "T'Pol", "-", "2088", "w"));
		tpl.add(new Person("29", "Montgomery", "Scott", "2222", "m"));
		tpl.add(new Person("30", "Hikaru", "Sulu", "2230", "m"));
		tpl.add(new Person("31", "Brian Liam", "Boothby", "2260", "m"));
		return tpl;
	}
}
