package j08_클래스;
//this는 현재 자기 자신을 키워드로 주소를 불러낸다.
public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User(){
		System.out.println("생성.");
	}
	
	User(String name){
		System.out.println(name);
	}
	
	User(String name, String age, String phone, String address ){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	
	
	
	
	
	void setName(String name) {
		System.out.println("setName메소드 안에서 호출:"+this);
		this.name = name;
	}
}
