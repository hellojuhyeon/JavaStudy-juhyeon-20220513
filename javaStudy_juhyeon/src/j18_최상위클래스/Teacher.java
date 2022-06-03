package j18_최상위클래스;
//오브젝트 클래스 - 자바 프로그래밍 할때 중요한 요소, 형변환, 다형성을 좀 더 확장해서 사용가능
/*
 * Object class(최상위 클래스)
 * 
 */
public class Teacher extends Object {
	private String name;
	private String subject;
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Teacher) {
			Teacher teacher = (Teacher) obj;
			
			if(this.name.equals(teacher.name)&&this.subject.equals(teacher.subject)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "이름: " + name +" "+ "과목: " + subject;
	}
	public void classInfo() {
		System.out.println(this.getClass());
	}
	
}
