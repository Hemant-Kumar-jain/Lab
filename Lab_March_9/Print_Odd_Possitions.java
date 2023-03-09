package array;

public class Print_Odd_Possitions { 
	public static void main(String[] args) {  
		int [] a = new int [] {1,2,3,4,5};  
		System.out.println("Odd Possition Elements are: ");    
		for (int i = 0; i < a.length; i = i+2) {  
			System.out.println(a[i]);  
		}  
	}  
}  

