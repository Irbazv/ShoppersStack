package com.family.myfamily;

public class String_Oreo {
	static String oreo(String s1,String s2)
	{
		for (int i = 0; i <s1.length(); i++) 
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
	return s2;
	}
	

	public static void main(String[] args) {
		String a1="jAvA";
		String a2="";
		System.out.println(oreo(a1,a2));
	
		

	}

}
