package Encapsulation;

public class Mainclass4 {

	public static void main(String[] args) {
		Instagram i1=new Instagram();
		int x=i1.get_pwd();
		System.out.println(x);
		i1.set_pwd(3214);
		System.out.println(i1.get_pwd());

	}

}
