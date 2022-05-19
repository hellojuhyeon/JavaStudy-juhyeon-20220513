package j06_반복;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		/*
		 * 반복횟수를 입력하세요:5
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		int num = 0;
		Scanner scanner = new Scanner(System.in);


		System.out.print("반복횟수를 입력하세요. : ");
		num = scanner.nextInt();

		int i = 0;
		while(i<num) {
			
			
			System.out.println(i+1);
			i++;
		}
		i=0;

		while(i<num) {                   //<-------------------
			System.out.println(num-i);   // 반복되면서 1작아진 i가 num에서 빠지면서 숫자가 출력된다.// 엥간하면 동일하게 i를 넣어준다.
			i++;                        //<--------------------
		}
		
	}

}
