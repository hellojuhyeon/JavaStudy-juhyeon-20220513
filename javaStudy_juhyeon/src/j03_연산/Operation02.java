package j03_연산;

/*논리연산자
*
*AND => && - 곱 => 모든 조건이 참일때 T의 결과를 가짐.
*OR  => || - 합 => 
*NOT => ! 
*
*0=FALSE
*!0=TRUE
*
*t(1) && t(1) => t(1)
**(1) && f(0) => f(0)
*/

public class Operation02 {

	public static void main(String[] args) {
		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		System.out.print("result1 AND result2: " + (result1 && result2));
	}

}
