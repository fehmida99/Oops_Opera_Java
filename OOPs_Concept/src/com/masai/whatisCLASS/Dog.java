package com.masai.whatisCLASS;

public class Dog extends Two_Classes_In_Java__Animal{

	
	void bark() {
		System.out.println("Dog is barking.");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat("Tommy");
		
		d.color="white";
		
		d.bark();
		
	}
}


