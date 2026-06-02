package Übungsblatt5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Aufgabe18a {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();

		myList.add("Mein");
		myList.add("kleiner");
		myList.add("grüner");

		for (int i = 0; i < args.length; i++) {
			myList.add(3, args[i]);
		}

		if (!myList.contains("Hollari")) {
			myList.add("Hollari");
		}

		if (!myList.contains("hollari")) {
			myList.add("hollari");
		}

		if (!myList.contains("hollaro")) {
			myList.add("hollaro");
		}

		ListIterator<String> iter = myList.listIterator(myList.size() - 5);

		while (iter.hasNext()) {
			System.out.print(iter.next());

			if (iter.hasNext()) {
				System.out.print(", ");
			}

			if (!iter.hasNext()) {
				System.out.print("!");
			}

		}

	}
}
