public class FactorialIterative implements Factorial {
	public static void main(String[] args) {
		int number = 4;
		int otherNum = factorial(number);
		System.out.printf("%d's factorial is %d\n", number, otherNum);
	}
	
	public static int factorial (int n) {
		int total = n;
		for (int i = n - 1; i > 0; i--) {
			total *= i;
		}
		return total;
	}
	
}
