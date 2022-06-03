package j20_컬렉션;

import java.util.ArrayList;

import j20_컬렉션.entity.Student;

public class ArrayListEx3 {
	
	public static void main(String[] args) {
		Student st1 = new Student(20220001, "강주현", "경남항공고등학교");
		Student st2 = new Student(20220002, "임경한", "경남정보대학교");
		Student st3 = new Student(20220003, "김준일", "부산교육대학원");
		Student st4 = new Student(20220004, "한재안", "부산대학교");
		Student st5 = new Student(20220005, "전주홍", "동아대학교");
		Student st6 = new Student(20220006, "한대경", "서울대학교");

		//1.Student자료형을 담을 수 있는 ArrayList를 생성, 
		//2.학생정보추가
		//studentCode name schoolName
		//20220001  강주현 경남항공고등학교
		//20220002  임경한 경남정보대학
		//20220003  김준일 부산교육대학원
		//20220004  한재안 부산대학교
		//20220005  전주홍 동아대학교
		//3.전체 학생 정보 출력
		//20220006  한대경 서울대학교
		//4.인덱스3의 위치에 삽입
		//5.인덱스2의 위치에 있는 학생의 학교명을 고려대로 바꾸기
		//6.인덱스5의 위치에 있는 학생의 정보를 20220007 김나예 부산여자중학교 로 바꾸기
		//7.인덱스 0의 위치에 있는 학생의 정보를 삭제
		
		//1.자료형을 담을 수 있는 ArrayList를 생성
		ArrayList<Student> student = new ArrayList<Student>();
		
			//2.학생정보추가
			student.add(st1);
			student.add(st2);
			student.add(st3);
			student.add(st4);
			student.add(st5);

			
			//3.전체학생정보출력
			System.out.println("학생모두출력"+ student);
			
			
			//4.인덱스3의 위치에 삽입
			student.add(3, st6);
			System.out.println("인덱스3정보추가" + student);
			
			//5.인덱스2의 위치에 있는 학생의 학교명을 고려대로 바꾸기
			student.get(2).setSchoolName("고려대학교");
			System.out.println("인덱스2정보변경" + student);
			
			
			//6.인덱스5의 위치에 있는 학생의 정보를 20220007 김나예 부산여자중학교 로 바꾸기
			student.set(5, new Student(20220007, "김나예" , "부산여자중학교"));
			System.out.println("인덱스5정보변경" + student);
			
			//7.인덱스 0의 위치에 있는 학생의 정보를 삭제
			student.remove(0);
			System.out.println("인덱스0정보제거" + student);
	}
}
