package ExceptionHadling;

import java.util.Scanner;

public class Throw_IfNegative {
	public static void product(int x,int y) throws Exception {
		if(x<0 && y<0) {
			throw new Exception("X and Y not be Negative or Zero");
		}
		else {
			System.out.println("Product of x and y is: "+x*y);
		}
		
	}
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Integers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		product(x,y);
	}

}
