package com.tnsif.keywords;

class Keys{
	int a=10;
	public void show() {
	
	int a=30;
	System.out.println(a);
	System.out.println(this.a);
	
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		
		Keys k =  new Keys();
		k.show();

	}

}
