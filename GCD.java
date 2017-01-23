// Greatest Common Divisor (Recursive Algorithm)

public class GCD {
	public static int gcd(int m, int n) {
		if (m % n == 0) return n;
		return gcd(n, m % n);
	}
}
