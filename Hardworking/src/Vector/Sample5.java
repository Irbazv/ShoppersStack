package Vector;

import java.util.Vector;

public class Sample5 {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		Vector l2=new Vector();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(110);
		l2.add(120);
		l1.removeAll(l2);
		System.out.println(l1);
	
		

	}

}
