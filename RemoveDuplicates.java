// Removes duplicate values from Array List

import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter ten numbers: ");
		String[] stringArray = input.nextLine().split(" ");
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (String s : stringArray) {
			array.add(Integer.parseInt(s));
		}
		removeDuplicate(array);
		System.out.println("The distinct values are: "+array.toString());
		input.close();
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int a=0; a<list.size(); a++) {
			Integer value = list.get(a);
			for (int b=0; b<list.size(); b++) {
				if (b == a) continue;
				if (list.get(b) == value) {
					list.remove(b);
				}
			}
		}
	}
}
