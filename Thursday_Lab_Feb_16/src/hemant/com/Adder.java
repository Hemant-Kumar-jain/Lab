package hemant.com;
import java.util.*;

class Arithmetic{
	int sum;
	int add(int x,int y) {
		sum=x+y;
		return sum;
	}
}
public class Adder extends Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		Adder ad=new Adder();
		int result=ad.add(a, b);
		System.out.println("The sum of "+a+" & "+b+" is: "+result);
		
		
	}

}
