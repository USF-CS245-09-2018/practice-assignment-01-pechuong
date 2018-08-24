public class FactorialRecursive implements Factorial {
	public static void main(String[] args) {
		int number = 4;
		int otherNum = factorial(number);
		System.out.printf("%d's factorial is %d\n", number, otherNum);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
