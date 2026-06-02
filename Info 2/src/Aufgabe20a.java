package Übungsblatt5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

public class Aufgabe20a {

	public static void main(String[] args) {

		ArrayList<String> parameter = new ArrayList<>(Arrays.asList(args));
		System.out.println("Übergebene Parameter" + parameter);
		
		UnaryOperator<String> upper = s -> {return s.toUpperCase();};
		
		parameter.replaceAll(upper);
		
		parameter.removeIf (a -> a.startsWith("A"));
		
		parameter.forEach(System.out::println);
		
		
	}

}
