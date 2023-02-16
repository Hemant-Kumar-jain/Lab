package hemant.com;

class A{ // Base class A
	void a(){ // create method
		System.out.println("It is the base class of B");
	}
}
class B extends A{ // derived class B from base class A
	void b() { // create method
		System.out.println("It is the base class of C");
	}
}

public class C extends B{ // derived class C from base class B
	void c() { // create method
		System.out.println("It is derived class from base class B");
	}
	public static void main(String[] args) {
		C c=new C();
		c.a(); // method calling
		c.b(); // method calling
		c.c(); // method calling
		
		}

	}

// This Example is known as Multi-level inheritance
