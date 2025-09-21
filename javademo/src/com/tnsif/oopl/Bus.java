package com.tnsif.oopl;

public interface Bus {
	void start();
	void stop();

}

class Movement implements Bus{
	public void start() {
		System.out.println("Bus starts");
	}
	public void stop() {
		System.out.println("Bus stops");
	}
}
