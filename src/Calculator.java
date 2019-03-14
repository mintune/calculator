import java.util.Scanner;

public class Calculator {
	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.println("덧셈 : " + result);
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.println("뺄셈 : " + result);
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("곱셈 : " + result);
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.println("나눗셈 : " + result);
		} else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = Input.getFirstValue(scanner);

		int result = first;

		while (true) {
			String symbol = Input.getSymbol(scanner);

			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(result, symbol, second);
		}
	}
}
