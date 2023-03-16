package string;
import java.util.regex.*; 

public class IPAddress {  
	public static boolean checkIP(String ip){   
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";   
		String regex= zeroTo255 + "\\."+ zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;   
		Pattern p = Pattern.compile(regex);    
		if (ip == null) { 
			return false;  
		}  
		Matcher m = p.matcher(ip);   
		return m.matches();  
		}  
		public static void main(String args[]){
			//Case 1
			String str1 = "000.12.12.034";    
			System.out.println("Output is: "+ checkIP(str1));
			//Case 2
			String str2 = "121.234.12.12";    
			System.out.println("Output is: "+ checkIP(str2));  
			//Case 3
			String str3 = "23.45.12.56";    
			System.out.println("Output is: "+ checkIP(str3));
			//Case 4  
			String str4 = "00.12.123.123123.123";   
			System.out.println("Output is: "+ checkIP(str4));  
			//Case 5  
			String str5 = "122.23";  
			System.out.println("Output is: "+ checkIP(str5)); 
			String str6 = "Hello.IP";  
			System.out.println("Output is: "+ checkIP(str6)); 
			
			}  
		}  
