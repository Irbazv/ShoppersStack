package Encapsulation;

public class Mainclass3 {

	public static void main(String[] args) {
	Phonepe p1=new Phonepe();
	int x=p1.getpin();
	System.out.println(x);
	p1.setpin(4321);
    System.out.println(p1.getpin());
	}

}
