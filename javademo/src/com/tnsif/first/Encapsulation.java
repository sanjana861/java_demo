package com.tnsif.first;

class Car{
	private String color;
	private String model;
	private String company;
	
	public void setDetails(String c, String m, String comp) {
		color=c;
		model=m;
		company=comp;
	}
	public void showDetails() {
		System.out.println("Car Details:");
		System.out.println("Color: "+color);
		System.out.println("Model: "+model);
		System.out.println("Company: "+company);
	}
	
	public void move() {
		System.out.println(model+" is Moving");
	}
	public void stop() {
		System.out.println(model+" has stopped");
	}
	public void drift() {
		System.out.println(model+" has drifting!");
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setDetails("Grey","Tata Punch","mini_SUV");
		c1.showDetails();
		c1.move();
		c1.drift();
		c1.stop();
	}
}
