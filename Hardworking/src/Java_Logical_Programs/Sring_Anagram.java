package Java_Logical_Programs;

import java.util.Arrays;

public class Sring_Anagram {
	static void oreo1(String a,String b)
	{
	if(a.length()==b.length())
	{
       char[]arr=a.toCharArray();
       char[]abb=a.toCharArray();
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
	}
	

	public static void main(String[] args) {
		String s1="god";
		String s2="dog";
         oreo1( s1, s2);
		
	

}


}