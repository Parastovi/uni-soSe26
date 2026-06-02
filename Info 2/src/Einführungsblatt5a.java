package Übungsblatt5;
import java.util.ArrayList;
import java.util.Arrays;

public class Einführungsblatt5a {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int i = 0; i <= 9; i++) {
			liste.add(i, i);
			array[i] = i;
		}
		
		liste.removeIf(zahl -> zahl % 2 != 0);

		
		int[] newArray = new int[array.length / 2];
		int index = 0;
		
		for (int i = 0; i < array.length; i += 2) {
			newArray[index] = array[i];
			index++;
		}
		
		
		
		System.out.println("ArrayList liste: " + liste);
		System.out.println("Array array: " + Arrays.toString(array));
		System.out.println("newArray: " + Arrays.toString(newArray));
	}

}
