package Encapsulation;

public class Mainclass2 {

	public static void main(String[] args) {
	Whatsapp w1=new Whatsapp();
	int x=w1.get_contactno();
	System.out.println(x);
	w1.set_contactno(9876788);
	System.out.println(w1.get_contactno());

	}

}
