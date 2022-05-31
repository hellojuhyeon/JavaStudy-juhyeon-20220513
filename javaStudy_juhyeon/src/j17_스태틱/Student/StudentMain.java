package j17_스태틱.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("강주현", 1);
		Student s2 = new Student("김주현", 3);
		Student s3 = new Student("이주현", 1);
		Student s4 = new Student("오주현", 2);
		Student s5 = new Student("박주현", 2);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		s5.showInfo();
	}

}
