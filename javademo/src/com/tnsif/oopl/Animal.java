package com.tnsif.oopl;

public interface Animal {
	void sleep();
	
}
interface Pet extends Animal{
	void sound();
}

class Cat implements Pet{
	public void sleep() {
		System.out.println("Cat sleeps");
		
	}
	public void sound() {
		System.out.println("Meaws");
	}
}
class Dog implements Pet{
	public void sleep() {
		System.out.println("Dog sleeps");
		
	}
	public void sound() {
		System.out.println("Bow Bow");
	}
}
