package j05_조건;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		if(score==100) {
			System.out.println("만점입니다.");
		}else if(score>89) {
			System.out.println("90점 이상입니다.");
		}else if(score>79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("...");
		}
	}

}
