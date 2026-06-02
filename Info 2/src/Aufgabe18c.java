package Übungsblatt5;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe18c {

	public static void main(String[] args) {
		
		HashSet<Character> mySet = new HashSet<>();

        for (String arg : args) {
            for (char c : arg.toCharArray()) {
                mySet.add(c);
            }
        }

        Object[] myArray = mySet.toArray();
        
        System.out.println(Arrays.toString(myArray));

        for (Object obj : myArray) {
            Character zeichen = (Character) obj;
            System.out.println(zeichen);

            ArrayList<String> sammelbox = new ArrayList<>();
            for (String arg : args) {
                if (arg.contains(String.valueOf(zeichen))) {
                    sammelbox.add(arg);
                }
            }
            System.out.println(String.join(", ", sammelbox));
        }

	}

}
