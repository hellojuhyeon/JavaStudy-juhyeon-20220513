package j11_자바배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		for(int i = 0 ; i<numbers.length;i++) {
			System.out.print(numbers[i]);
			if(numbers.length-1 != i) {
				System.out.print(",");
			}
		}
		
		System.out.println();
		
		for(int i = 0 ; i<numbers.length ; i++) {
			System.out.print(numbers[i]+(numbers.length-1 !=i ? ",":""));
		}
		
		System.out.println();
		
		int i = 0;
		
		
		for(int num : numbers) {  //인덱스가 필요없다.
			System.out.print(num + (numbers.length-1 != i ? ",":"" ));
			i++;                    //i++이 후증가 연산이니까numbers.length-1 - 7번째 인덱스 다음 연산에서 "," 대신 ""실행
		}
		
		
	}

}
