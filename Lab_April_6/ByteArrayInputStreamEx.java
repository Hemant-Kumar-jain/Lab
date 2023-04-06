package ioStream;
import java.io.*;
public class ByteArrayInputStreamEx {
	public static void main(String[] args) {
		byte [] arr= {72,69,77,65,78,84};
		ByteArrayInputStream bin=new ByteArrayInputStream(arr);
		int i=0;
		while((i=bin.read())!=-1) {
			char ch=(char)i;
			System.out.println("ASCII character "+i+" "+"value is: "+ch);
		}
	
	}
}
