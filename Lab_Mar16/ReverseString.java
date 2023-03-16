package string;

public class ReverseString {  
	public static void main(String[] args){
		String str="I am Hemant Jain";
		    String str1[]=str.split("\\s");  
		    String reverse=" ";  
		    for(String w:str1){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverse+=sb.toString()+" ";  
		    }  
		    System.out.println(reverse.trim());
		    
		}  
		}  
      
   