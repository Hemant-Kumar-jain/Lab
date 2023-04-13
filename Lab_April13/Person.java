package collections;
import java.util.*;

public class Person {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hemant");
		al.add("Aman");
		al.add("Saurabh");
		al.add("Sagar");
		al.add("Aryan");
		al.add("Amit");
		al.add("Luis");
		al.add("Bob");
		al.add("Martin");
		al.add("Jack");
		for(String s:al) {
			System.out.println("The Name of Persons are: "+s);
		}
	}
}
