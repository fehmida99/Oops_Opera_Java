package com.Interface_By_using_default_and_static_keyword;

public interface Drawable {

	// method without body.
	void draw();

	
	//default method
	default void defaultMethod() {
		System.out.println("this is a default method in the interface");
	}

	
	//static method
	static void staticMethod() {
		System.out.println("this is a static method in the interface");
	}

}
