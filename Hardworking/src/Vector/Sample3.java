package Vector;

import java.util.Vector;

public class Sample3 {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add("hi");
		l1.add(true);
		l1.add(null);
		l1.add(20.6);
		System.out.println(l1);
		Vector l2=new Vector();
		l2.add('A');
		l2.add('B');
		l2.add('C');
		l1.addAll(l2);
		System.out.println(l1);
	
		

	}

}
