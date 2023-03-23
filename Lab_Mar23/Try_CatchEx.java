package ExceptionHadling;

import java.util.Scanner;

public class Try_CatchEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Inputs:");
		try {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
