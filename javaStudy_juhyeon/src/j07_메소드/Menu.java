package j07_메소드;

import java.util.Scanner;

public class Menu {
	
	public static char inputSelect() {
		Scanner scanner = new Scanner(System.in);
		char select = 0;
		System.out.println("명령을 입력하세요: ");
		select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	public static char showMenu1() {
		return ' ';
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 선언-인풋
		
		boolean loopFlag = true; 
		
		System.out.println("프로그램 시작"); //프로그램 시작 선언-필요없음
		
		
		while(loopFlag) {
			char select = 0; //select 변수 0 지정
			
			System.out.println("[메뉴선택]");//선택지 출력
			System.out.println("1. Java");
			System.out.println("2. Python");
			System.out.println("3. Javascript");
			System.out.println("q. 프로그램종료");
			
			System.out.println("명령을 입력하세요.");
			select = scanner.next().charAt(0); //문자열 입력받음
			scanner.nextLine(); //엔터키 입력받음
			
			
			if(select=='q') {  //만약 q를 선택한다면
				break;  //프로그램 중지
			}else if(select == '1') {  //만약 1번을 선택한다면
				System.out.println("Java를 선택하셨습니다."); //1번메뉴 설명 및 선택지 
				while(true) {
					System.out.println("[Java 메뉴]");
					System.out.println("1.Java 란?");
					System.out.println("b.뒤로가기");
					
					System.out.println("명령을 입력하세요.");
					select = scanner.next().charAt(0); //문자열 입력받음
					scanner.nextLine(); 
					
					if(select=='b') { //만약 b를 선택한다면
					break; //프로그램 중지
					
					}else if(select=='q') {
						loopFlag = false;
						break;
					}
					else if(select=='1'){ //만약 1을 선택한다면
						System.out.println("Java란 컴퓨터언어입니다."); //1번 메뉴 설명충 등판
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
						
					}else {//선택한 것이 선택지 중 존재하는것이 아니라면
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					System.out.println();
				}
				
			}else if(select == '2') {
				System.out.println("Python을 선택하셨습니다.");
				while(true) {
					System.out.println("[Python 메뉴]");
					System.out.println("1.Python이란?");
					System.out.println("b.뒤로가기");
					
					System.out.println("명령어를 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					if (select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("Python이란 컴퓨터 언어입니다.");
						System.out.println("계속하려면 엔터를 눌러주세요.");
						scanner.nextLine();
						
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					System.out.println();
				}
				
			}else if(select == '3') {
				System.out.println("Javascript를 선택하셨습니다.");
				while (true) {
					System.out.println("[Javascript 메뉴]");
					System.out.println("1.Javascript란?");
					System.out.println("b.뒤로가기");

					System.out.println("명령어를 입력하세요");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					if (select == 'b') {
						break;
						
					}else if(select == '1') {
						System.out.println("Javascript란 컴퓨터 언어입니다.");
						System.out.println("계속하려면 엔터를 누르세요.");
						scanner.nextLine();
					} else {
						System.out.println("해당 명령은 보기에 없습니다");
						System.out.println("다시입력하세요");
					}
				}
				
				
			
			System.out.println();
		}
		

	}
		System.out.println("프로그램 종료");

	}
}
