package j04_입력;

import java.util.Scanner;

public class input02 {

	public static void main(String[] args) {
		
		/* 문자열 1 입력: nextLine()  hi
		 * 문자열 2 입력: next()   안녕
		 * 문자 입력 : next().charAt(0)  A
		 * 정수입력 : nextInt() 10
		 * 실수입력 : nextDouble() 3.14
		 * scanner.next();					//문자열(String)
		scanner.nextLine();				//문자열(String)
		scanner.next().charAt(0);		//문자(char)
		scanner.nextInt();				//정수(int)
		scanner.nextDouble();			//실수(double)
		 * 
		 *
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.println("문자열1 입력");
		a = scanner.nextLine();
		System.out.println("문자열2 입력");
		b = scanner.next();
		System.out.println("문자 입력");
		c = scanner.next().charAt(0);
		System.out.println("정수 입력");
		d = scanner.nextInt();
		System.out.println("실수 입력");
		e = scanner.nextDouble();


		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
