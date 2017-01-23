import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		reverseNumber(number);
		input.close();
	}
	public static void reverseNumber(int number) {
		if (number <= 0) return;
		System.out.print(number % 10);
		reverseNumber(number / 10);
	}
}
