package threading;
import java.io.*;
import java.util.*;
public class Assignment2 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Store & 2 for Read");
		int num=sc.nextInt();
		FileOutputStream f=new FileOutputStream("F:\\Anudip Foundation.txt");
		FileInputStream f1=new FileInputStream("F:\\Hello.txt");
		String s="Welcome to coding contest...";
		byte b[]=s.getBytes();
		switch(num) {
		case 1: f.write(b);
				f.close();
				System.out.println("Successfully Completed");
				break;
		case 2: int i=0;
				while((i=f1.read())!=-1) {
				System.out.print((char)i);
				}
				f1.close();
				break;
		default: System.out.println("Enter valid number...");
	}
}
}
