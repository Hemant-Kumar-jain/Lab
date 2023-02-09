package hemant.com;


class Student1{
	int student_Id;
	int student_age;
	String student_name;
	String student_city;
	static String collage_name="Davim";

	public Student1(int student_Id,int student_age) {
		this.student_Id=student_Id;
		this.student_age=student_age;
	}
	public Student1(String student_name,String student_city) {
		this.student_name=student_name;
		this.student_city=student_city;
	}
	void display() {
		System.out.println(student_Id+" "+student_age);
	}
	void show() {
		System.out.println(student_name+" "+student_city);
	}
	
}
public class Student {
	public static void main(String[] args) {
	 
		 Student1 s1=new Student1(101,24);
		 Student1 s2=new Student1("Hemant","Faridabad");
		 Student1 s3=new Student1(102,26);
		 Student1 s4=new Student1("Aman","Ballabgarh");
		 
		 s1.display();
		 s2.show();
		 s3.display();
		 s4.show();
	 }
	}


