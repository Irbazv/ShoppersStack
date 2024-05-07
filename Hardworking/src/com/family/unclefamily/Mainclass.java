package com.family.unclefamily;

public class Mainclass {

	public static void main(String[] args) {
		Canara_bank c1=new Canara_bank();
		int x=c1.getatm_pin();
		System.out.println(x);
		c1.setatm_pin(1234);
		System.out.println(c1.getatm_pin());
	

	}

}
