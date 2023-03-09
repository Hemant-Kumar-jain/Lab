package array;

public class Find_Pairs {
	 public static void  main(String[] args){
		  pairs_value(new int[] {30,10,35,4,45,-5},40);
		  pairs_value(new int[] {15,10,21,3,2,9,4},25);
		  }
	static void  pairs_value(int a[], int number)
	  {
	  System.out.println("Find Pairs and there Sum: ");
	  for (int i =  0; i < a.length; i++){
		  for (int j  = i+1; j < a.length; j++){
			  if(a[i]+a[j] == number){
				  System.out.println(a[i]+" + "+a[j]+" = "+number);
			  }
		  }
	  }
	 }
	 
	}


