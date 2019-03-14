import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.print("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);

		// TODO 두 번째 값을 입력 받아 저장
		System.out.print("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);

		// TODO입력 받은 두 값에 대한 사칙연산을 계산해 출력
		if (symbol.equals("+")) {
			// TODO 덧셈 계산 후 출력
			System.out.println("덧셈 : " + (first + second));
		} else if (symbol.equals("-")) {
			// TODO 뺄셈 계산 후 출력
			System.out.println("뺄셈 : " + (first - second));
		} else if ("*".equals(symbol)) {
			// TODO 곱셈 게산 후 출력
			System.out.println("곱셈 : " + (first * second));
		} else if ("/".equals(symbol)) {
			// TODO 나눗셈 계산 후 출력
			System.out.println("나눗셈 : " + (first / second));
		} else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}

	}
}
