package hemant.com;

class Teacher{
	String collage_name="DAVIM";
	String designation="Senior Professor";
	void work() {
		System.out.println("Im Teaching in "+collage_name);
		System.out.println("My designation is "+designation);
	}
}
class Math_Teacher extends Teacher{
	String name="Parul";
	String subject="Mathematics";
	void M() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
}
class Soft_Skill_Teacher extends Teacher{
	String name="Charu";
	String subject="Soft Skill";
	void S() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
}
public class IT_Teacher extends Teacher{
	String name="Hemant";
	String subject="IT";
	void IT() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
	public static void main(String[] args) {
		Math_Teacher m=new Math_Teacher();
		Soft_Skill_Teacher s=new Soft_Skill_Teacher();
		IT_Teacher it=new IT_Teacher();
		m.M();
		m.work();
		s.S();
		s.work();
		it.IT();
		it.work();
		
	}
}
