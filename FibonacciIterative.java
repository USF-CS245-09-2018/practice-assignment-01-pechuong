public class FibonacciIterative implements Fibonacci {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = fibonacci(num);
		System.out.printf("Fibonacci %d is = %d\n", num, result);
	}
	public static int fibonacci(int n) {
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
