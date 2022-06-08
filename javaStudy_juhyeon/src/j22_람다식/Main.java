package j22_람다식;

public class Main {

	public static void main(String[] args) {
		Math2 m2_1 = new Math2Impl();
		Math2 m2_2 = new Math2(){

			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1*value2;
			}
		
		};
		//결과가 리턴밖에 없을 때 중괄호({}) 생략
		Math2 m2_3 = (v1, v2) -> v1/v2;//매개변수가 하나일 경우에는 괄호 생략가능
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	}
		
}