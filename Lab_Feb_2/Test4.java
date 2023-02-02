package hemant.com;
import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("The Sum is: "+sum);
		
		int sub=a-b;
		System.out.println("The Substraction is: "+sub);
		
		int mul=a*b;
		System.out.println("The Multiplication is: "+mul);

		int div=a/b;
		System.out.println("The Division is: "+div);
		
		int rem=a%b;
		System.out.println("The Remainder is: "+rem);
	}

}
