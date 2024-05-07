package Scanner_Class;

import java.util.Scanner;

public class Toogle {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s1=sc.nextLine();
	   String s2="";
	   for(int i=0;i<s1.length();i++)
	   {
		   char ch=s1.charAt(i);
		   if(ch>=65&&ch<=90)
		   {
			   s2=s2+(char)(ch+32);
		   }
	   
	   
		   else if(ch>=97&&ch<=122)
		   {
			 s2=s2+(char)(ch-32);   
		   }
	   }
	   
	   
	   System.out.println(s2);

	}

	
		
	}
	
	


