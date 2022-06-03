package j18_최상위클래스;

import java.util.Scanner;
/*equals와 ==의 차이점
 * equals는 내용을 비교하는것
 * ==은 주소를 비교하는것
 * 
 */
public class StringObj {

	public static void main(String[] args) {
		String name = "강주현";
		String name2 = "강주현";//리터럴 주소라서 True- 리터럴값:
		
		System.out.println(name==name2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 :");
		name = scanner.nextLine();
		System.out.print("이름 :");
		name2 = scanner.nextLine();//주소가 달라서 false
		
		System.out.println(name==name2);
		
		name = new String("강주현");
		name2 = new String("강주현");
		System.out.println(name==name2);//주소가 달라서 false
		System.out.println("비교출력값:"+ name.equals(name2));
		/*
		 * 값은 다른데 주소비교하는 방법 : (name.equals(name2))
		 * equals를 사용하면 name과 name2의 값을 비교가능!!
		 */
	}

}
