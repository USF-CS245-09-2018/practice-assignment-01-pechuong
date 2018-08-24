public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		int firstNum = 0;
		int secondNum = 1;

		if (n == 0) {
			return firstNum;
		} else if (n == 1) {
			return secondNum;
		}

		for (int i = 0; i < n; i++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}
		return firstNum;
	}
}
