package hemant.com;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		float a=sc.nextFloat();
		System.out.println("Enter the number");
		float b=sc.nextFloat();
		System.out.println("Enter the number");
		float c=sc.nextFloat();
		System.out.println("Enter the number");
		float x=sc.nextFloat();
		
		
		float f=(a*b-b*b)/(c-x);
		System.out.println(f);
	}

}
