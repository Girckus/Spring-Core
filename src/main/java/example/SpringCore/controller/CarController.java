package example.SpringCore.controller;

import org.springframework.stereotype.Controller;

import example.SpringCore.beans.Car;

@Controller()
public class CarController {
	
	private Car car;
	
	public CarController(Car car) {
		this.car = car;
	}
	
	public String info() {
		return car.toString();
	}
	
}