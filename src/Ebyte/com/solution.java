package Ebyte.com;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 int t = scan.nextInt();
	 
	 for (int i = 0 ; i < t ; i++) {
		 try {
			 
			 String input = scan.next();
			 long n = Long.parseLong(input);
			 System.out.println(n + "can be fitted in :");
			 
			 if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) 
				 System.out.println("* byte ");
			 if(n >= Short.MIN_VALUE && n <= Short.MIN_VALUE)
				 System.out.println("* Short ");
			 if(n >Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
				 System.out.println("* Integer  ");
			 if(n >Long.MIN_VALUE && n <= Long.MAX_VALUE)
				 System.out.println("* Long  ");
			 
		   }catch (Exception e) {
			System.out.println(scan.next()+"con't be fitted anywhere "); 
		 }
		 
	   }
	  scan.close();
      
	}

}
