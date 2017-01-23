// Sum of the digits in a number 123 = 1 + 2 + 3 = 6

public class DigitSum {
	public static int digitSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
