package com.tnsif.oopl;

public interface Worker {
	void work();
}
interface Walker{
	void walk();
}
interface Speaker{
	void speak();
}
class Robot implements Worker,Walker,Speaker{
	public void work() {
		System.out.println("Robot is working");
	}
	public void walk() {
		System.out.println("Robot is walking");
	}
	public void speak() {
		System.out.println("Robot is speaking");
	}
}