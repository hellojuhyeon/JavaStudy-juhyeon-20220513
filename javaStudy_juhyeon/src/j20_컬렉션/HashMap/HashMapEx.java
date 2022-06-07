package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;


public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사"); //맨 앞에 20220001이라는 값은 키값이기 때문에 중복이 안된다. 
		studentMap.put(44, "김준오"); //그러므로 맨 마지막 20220001의 객체인 김준오만 불러올 수 있는 것이다.
		
		//하지만 맨 앞에 키값을 서로 다르게 출력하면  studentMap의 모든 원소를 불러올 수 있다.

		System.out.println(studentMap);
		//key로 value 가져오기
		System.out.println(studentMap.get(10));
		//수정
		studentMap.put(10, "김준육");//x값이 없을 경우 추가가 됨
		studentMap.replace(10, "김준칠");
		
		studentMap.remove(10);
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//			System.out.println(studentMap.get(key));
			//}
			System.out.println(value);
		}
		
		
		
		
		//람다식 : 함수형 프로그래밍
		studentMap.forEach(
			(k,v)->{
				System.out.println("key: "+ k);
				System.out.println("value: "+ v);
			}
		);
			
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
	}
	

};
