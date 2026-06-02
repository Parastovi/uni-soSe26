package Übungsblatt5;

import java.util.Random;
import java.util.ArrayList;

public class Aufgabe20b {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < 5000; i++) {
			myList.add(random.nextInt(10000));
		}

		myList.replaceAll(a -> (a % 2 == 0) ? a * a : a);
		
		myList.removeIf(n -> {
			if (n < 2) return false;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			
		}
		return true;
		});
		
		myList.forEach(System.out::println);
		System.out.println("Anzahl Zahlen:" +myList.size());
		
		
	}

}
