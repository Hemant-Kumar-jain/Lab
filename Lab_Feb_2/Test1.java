package hemant.com;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the Number :");
			int number=sc.nextInt();
			sum+=number;   
		}
		float avg=sum/5;
		System.out.println("Average is: "+avg);
	}
}
