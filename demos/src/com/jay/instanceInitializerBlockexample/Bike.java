package com.jay.instanceInitializerBlockexample;

public class Bike extends Vihical {

	int speed;
	
	public Bike() {
		System.out.println(speed);
	}
	
	{
		speed=50;
		System.out.println("instance Initializer block");
	}
}
