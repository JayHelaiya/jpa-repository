package com.jay.instanceInitializerBlockexample;

public class Vihical {
	
	int speed;
	public Vihical() {
		System.out.println("vihical ranning");
	}
	
	{
		speed=80;
		System.out.println("perent block");
		System.out.println(speed);
	}
}
