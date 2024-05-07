package Vector;

import java.util.Vector;

public class Sample4 {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		Vector l2=new Vector();
		l2.add('A');
		l2.add('B');
		l2.add('C');
		l1.addAll(0,l2);
		System.out.println(l1);
	
		

	}

}
