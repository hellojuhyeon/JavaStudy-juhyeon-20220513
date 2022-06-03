package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("강주현","웹개발"); 
		Teacher t2 = new Teacher("강주현","웹개발"); 
		
		
		System.out.println(t1); //toString 생략해도 동일결과 출력 가능
		System.out.println(t2);
		System.out.println(t1==t2);//주소값이 달라서 false 출력
		System.out.println(t1.equals(t2));//주소값이 달라서 false 출력
		System.out.println(t1.hashCode()==t2.hashCode());
		
		
		/*
		 * 차이점이라 말할만한 내용으로는, 비교할 수 있는 대상에 대한 부분입니다. 
		 * equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만,
		 * == 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.
		 */
	}

}
