package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
/*
 * year = 1999
 * 
 * result = False
 * 년도가 4의 배수이면 true 아니면 false
 * 
 * 
 * 윤년이면 true 아니면 false
 * 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때 윤년
 * AND => && - 곱 => 모든 조건이 참일때 T의 결과를 가짐.
 * OR  => || - 합 => 
 * NOT => ! 
 * 
 */
		
		int year = 1999;
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		/* year변수가 year나누기 4가 0일때 그리고 year 나누기 100이 0이아닐때 또는 year%400이 0일때*/
		
		System.out.println(result);

	}

}
