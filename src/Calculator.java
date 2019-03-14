import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		// TODO 두 번째 값을 입력 받아 저장
		System.out.print("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		// TODO입력 받은 두 값에 대한 사칙연산을 계산해 출력
		
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + (first / second));
	}
}
