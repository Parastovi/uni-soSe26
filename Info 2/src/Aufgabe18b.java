package Übungsblatt5;

import java.util.HashSet;
import java.util.ArrayList;

public class Aufgabe18b {

	public static void main(String[] args) {
		
		HashSet<Character> mySet = new HashSet<>();
		
		for (int i = 0; i < args.length; i++) {
			char[] zeichenArray = args[i].toCharArray();
			
			for (int j = 0; j < zeichenArray.length; j++) {
				mySet.add(zeichenArray[j]);
			}
			
		}

		System.out.println(mySet);
	
		
		
		for (Character zeichen : mySet) {
			System.out.println(zeichen);
			
			ArrayList<String> sammelbox = new ArrayList<>();
			for (int i = 0; i < args.length; i++) {
				if (args[i].contains(String.valueOf(zeichen))){
					sammelbox.add(args[i]);
				}
			}
		
		System.out.println(String.join(", ", sammelbox));
		}
	}

}
