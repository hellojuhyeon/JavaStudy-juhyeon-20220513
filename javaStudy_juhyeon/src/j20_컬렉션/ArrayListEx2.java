package j20_컬렉션;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		
		
		
		
		
		//리스트에 값 추가 -> add()
		
		nameList.add("강주현");
		nameList.add("임경한");
		nameList.add("김준일");
		nameList.add("서재효");
		nameList.add("최보성");
		nameList.add("유재원");
		nameList.add("박준형");
		nameList.add("김서홍");
		
		//리스트에 중간에 값 추가 -> add(추가위치, 추가내용)
		nameList.add(0, "김주현");
		//리스트 내의 값 수정 -> set(수정할 위치, 수정할 내용)
		nameList.set(3, "김주현"); 
		
		//리스트 내의 모든 값 확인 ->toString()<--생략
		System.out.println(nameList);
		//리스트 내의 값 제거(인덱스) -> remove(인덱스번호)
		nameList.remove(4);
		System.out.println("인덱스 명단삭제"+nameList);
		//리스트 내의 값 제거(이름 지정) -> remove(명단)
		nameList.remove("임경한");
		System.out.println("이름지정 명단삭제"+nameList);
		
		//리스트에서 리스트로 값 옮기기 ->주소만 복사하거나, 내용을 통으로 복사할수 있음
		//깊은복사
		nameList2.addAll(nameList);
		System.out.println("인덱스 깊은복사:" +nameList2);
		
		
		//리스트 내의 값 중 인덱싱 ->get(인덱스번호)
		System.out.println(nameList.get(0));
		
		//리스트내의 원하는 값이 있는지 확인 ->contain(확인 할 값 입력) -> 내용이 있으면 true, 없으면 false출력
		System.out.println(nameList.contains("김태송")); 
		System.out.println(nameList.contains("강주현"));
		
		//리스트내에서 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) { //만약 namaList안에 아무것도 없으면
			nameList.clear();  //nameList내부를 비워라
		}
		System.out.println(nameList); //-->내부가 비워졌기때문에 []만 출력
		System.out.println(nameList2); //-->내부가 비워졌기때문에 []만 출력
		//리스트를 배열로 변환
		Object[] objs = nameList2.toArray();
		for(Object obj : objs) {
			System.out.println((String) obj);
		}
		

	}
}
