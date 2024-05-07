package Encapsulation;

public class Sample1 {

	public static void main(String[] args) {
		Sample s1=new Sample();
		System.out.println(s1);
		Sample s2=s1;
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
