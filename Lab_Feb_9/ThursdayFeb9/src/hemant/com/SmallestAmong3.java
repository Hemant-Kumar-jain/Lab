package hemant.com;
import java.util.*;

public class SmallestAmong3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("Enter Third Number");
		int c=sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println("A is smaller than B & C : "+a);
		}
		else if(b<a && b<c) {
			System.out.println("B is smaller than A & C : "+b);
		}
		else {
			System.out.println("C is smaller than A & B : "+c);
		}
	}
}
