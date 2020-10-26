package com.kidco.gamming.car;

public class Car {

	public String carName;
	public String carColor;
	public int numberOfWheels;
	public int speed;
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(carName + " : color: "+  carColor + "-  started");
	}
	public void setSpeed(int speedParam) {
		// TODO Auto-generated method stub
		speed = speedParam;
		System.out.println(carName + " - "+  numberOfWheels + "  wheels running with speed "+speedParam);
	}
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println(carName + "  stopped");
	}

}
