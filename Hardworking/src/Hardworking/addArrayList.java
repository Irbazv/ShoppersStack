package Hardworking;

import java.util.ArrayList;

public class addArrayList {

	public static void main(String[] args) 
	{
		ArrayList l1= new ArrayList();
		l1.add(10);
		l1.add(10.6);
		l1.add("HI");
		l1.add(10);
		l1.add(true);
		l1.add('a');
		l1.add(null);
		
		ArrayList l2= new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		
		System.out.println("add(object obj) l1 = "+ l1);
		System.out.println("add(object obj) l2 = "+ l2);
		
		l1.add(3, "Rocky");
		System.out.println("add(int index, object obj) = "+ l1);
		
		l1.addAll(l2);
		System.out.println(l1);
		
		l1.addAll(4,l2);
		System.out.println("add ="+ l1);
		
		l1.removeAll(l2);
		System.out.println(l1);
		
		l1.retainAll(l2);
		System.out.println(l1);
		
		ArrayList l3= new ArrayList();
		l3.add("Mandya");
		l3.add("Ramnagara);
		l3.add("Mysore");
		l3.add("Tumkur");
		l3.add("Anandpur);
		l3.add("Bengaluru);
		
		System.out.println(l3);
		l
	}

}
