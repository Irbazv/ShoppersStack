package Java_Logical_Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sample6 {

	public static void main(String[] args) {
		 String[]arr= {"hi","hello","bye","hi","hello"};
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!l1.containsKey(arr[i]))
			{
				l1.put(arr[i], 1);
				
			}
			else
			{
			int x=l1.get(arr[i]);
			x++;
			l1.put(arr[i], x);
			
			}
		}
		for(Entry<String,Integer>a1:l1.entrySet())
		{
			System.out.println(a1.getKey());
		}

	}

}
