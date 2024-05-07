package Encapsulation;

public class Mainclass1 {

	public static void main(String[] args) {
		Facebook f1=new Facebook();
		int x=f1.getpwd();
		System.out.println(x);
		f1.setpwd(199);
		System.out.println(f1.getpwd());
		
		

	}

}
