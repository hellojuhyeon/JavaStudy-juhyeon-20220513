package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력1: ");
		int num1 = scanner.nextInt();   /*값을 입력받는 함수*/
		System.out.print("값 입력2: ");
		int num2 = scanner.nextInt();
		
		
		System.out.println("입력한 값: "+(num1 +num2));/*괄호로 묶어서 우선순위를 높여준다*/
		
		scanner.next();					//문자열(String)
		scanner.nextLine();				//문자열(String)
		scanner.next().charAt(0);		//문자(char)
		scanner.nextInt();				//정수(int)
		scanner.nextDouble();			//실수(double)
	}

}
