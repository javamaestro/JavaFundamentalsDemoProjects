package com.kidco.gamming.app;

import com.kidco.gamming.car.Car;

public class GameApp {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.carName = "Tata-Safari";
		
		car.carColor = "Red";
		
		car.numberOfWheels = 4;
		
		car.start();
		
		car.setSpeed(9000);
		
		car.applyBreak();
		
	}

}
