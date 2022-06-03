package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		
		name.add("강주현");
		name.add("김주현");
		name.add("이주현");
		name.add("박주현");
		name.add("강주현");
		name.add("강주현");
		System.out.println(name);
		
		Iterator<String> iterator = name.iterator(); //줄세우는것
		while(iterator.hasNext()) {
			String name2 = iterator.next();
			if(name2.equals("강주현")) {
				System.out.println(name2);				
			}
			
		 }
			name.remove("이주현");
			System.out.println(name);
	}
}
