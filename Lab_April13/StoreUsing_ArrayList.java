package collections;
import java.util.*;

public class StoreUsing_ArrayList {
	ArrayList<Integer> A1= new ArrayList<Integer>();//create object of arraylist
	//create a method
	public ArrayList<Integer> storeOddNumbers(int N) {
		A1= new ArrayList<Integer>();
		for (int i=1;i<=N;i++) {
			if (i%2!=0) { 
				A1.add(i);
			}
			}
		return A1;
		}
	//create a method
	public ArrayList<Integer> printOddNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		System.out.println("The Odd Numbers are: ");
		for (int num:A1) {
			System.out.print(num+" ");
			A2.add(num*5);
			}
		System.out.println();
		System.out.println("After multiply by 5: ");
		for(int num1:A2) {
			System.out.print(num1+" ");
		}
		System.out.println();
		return A2;
		}
	//retrieving method
	public int retrieveOddNumber(int N) {
		if(A1.contains(N)) {
			return N;
		}
		return 0;
	}
	public static void main(String[] args) {//main method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		StoreUsing_ArrayList sea = new StoreUsing_ArrayList();//creating object 
		sea.storeOddNumbers(a);//call the method
		sea.printOddNumbers(); //call the method
		System.out.println("Retrieve Number is: "+sea.retrieveOddNumber(7));//retrieve the number
		}
	}

