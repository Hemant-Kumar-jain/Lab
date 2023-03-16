package string;

public class MaxOccurChar {
	public static void main(String[] args) {    
		String str = "Faridabad is a metro city.";    
		int[] len = new int[str.length()];    
		char maximum = str.charAt(0);    
		int max;                     
		char string[] = str.toCharArray();    
		for(int i=0;i<string.length;i++) {    
			len[i]=1;    
			for(int j=i+1;j<string.length;j++) {    
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0') {    
					len[i]++;
					string[j]='0';    
				}    
			}    
		}    	       
		max=len[0];    
		for(int i=0;i<len.length;i++) {    
			if(max < len[i]) {    
				max = len[i];    
				maximum = string[i];    
				}    
			}    	           
		System.out.println("Maximum occurring character: " + maximum);    
		}    
	}
