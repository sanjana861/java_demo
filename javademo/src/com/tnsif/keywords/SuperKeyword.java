package com.tnsif.keywords;

class Keys{
	int a=10;
}

class key1 extends Keys{
	int a =20;
	public void show() {
		int a = 40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		key1 k1=new key1();
		k1.show();
		

	}

}
