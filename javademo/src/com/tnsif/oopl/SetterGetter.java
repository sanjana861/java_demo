package com.tnsif.oopl;

class Voter{
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
		
	}
	public void setAge(int a) {
		if(a>0) {
			age=a;
		}
		else {
			System.out.println("Invalid age");
		}
		}
	public int getAge() {
		return age;
	}
}

public class SetterGetter {

	public static void main(String[] args) {
		Voter v=new Voter();
		v.setName("Sanjana");
		v.setAge(21);
		System.out.println("Name:"+v.getName());
		System.out.println("Age:"+v.getAge());
	}

}
