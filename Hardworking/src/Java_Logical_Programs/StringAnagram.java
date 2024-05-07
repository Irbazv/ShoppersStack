package Java_Logical_Programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1="god";
		String s2="dog";
		if(s1.length()==s2.length())
		{
	       char[]arr=s1.toCharArray();
	       char[]abb=s2.toCharArray();
	       Arrays.sort(arr);
	       Arrays.sort(abb);
	            String s3 =new String(arr);
	            String s4=new String(arr);
	            if(s3.equals(s4))
	            {
	            	System.out.println("its a string Anagram");
	            	
	            }
	            else
	            {
	            	System.out.println("it is not a String Anagram");
	            	
	            }
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
		}
		else
		{
			System.out.println("it is not a String Anagram");
		}
		


	}

}
