package example.SimpleSpringCore.beans.impl;

import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Animal;

@Component
public class Dog implements Animal {

	@Override
	public String makeSound() {
		return "Au Au";
	}

}