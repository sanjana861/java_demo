package com.tnsif.first;

public class Prime {

	public static void main(String[] args) {
		int a =100;
		
		System.out.println("Prime numbers upto "+a+" are:");
		for(int n=2;n<=100;n++) {
			boolean isPrime=true;
			
			for (int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isPrime =false;
					break;
					
				}
			}
			
			if(isPrime) {
				System.out.println(n+ " ");
			}
		}
			
	}

}
