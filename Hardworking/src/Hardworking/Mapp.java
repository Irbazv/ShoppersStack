package Hardworking;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Mapp {

	public static void main(String[] args) {
		HashMap <String,Integer> l1= new HashMap<String,Integer>();
		l1.put("Sachin", 10000);
		l1.put("Dhoni", 5000);
		l1.put("Kholi", 4000);
		l1.put("MaxWell", 2000);
		System.out.println("HashMap "+ l1);
		
		LinkedHashMap <String,Integer> l2= new LinkedHashMap<String,Integer>();
		l2.put("Sachin", 10000);
		l2.put("Dhoni", 5000);
		l2.put("Kholi", 4000);
		l2.put("MaxWell", 2000);
		System.out.println("LinkedHashMap "+ l2);
		
		TreeMap <String,Integer> l3= new TreeMap <String,Integer>();
		l3.put("Sachin", 10000);
		l3.put("Dhoni", 5000);
		l3.put("Kholi", 4000);
		l3.put("MaxWell", 2000);
		System.out.println("TreeMap "+ l3);

	}

}
