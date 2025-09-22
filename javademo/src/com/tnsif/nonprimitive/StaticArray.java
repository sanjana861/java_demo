package com.tnsif.nonprimitive;

public class StaticArray {

	public static void main(String[] args) {
		String[] names={"keerthi","srujana","madhu","sanjana"};
		
		System.out.println("Names of students :");
		for(int i=0;i<names.length;i++) {
			System.out.println("Roll "+(i+1)+": "+names[i]);
		}
		

	}

}
