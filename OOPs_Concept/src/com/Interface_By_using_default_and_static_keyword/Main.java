package com.Interface_By_using_default_and_static_keyword;

public class Main implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
         System.out.println("Draw circle ..");
	}
public static void main(String[] args) {
//	Main m =  new Main();
//	m.draw();
	
	
	
	Drawable d = new Main();
	d.defaultMethod();
	System.out.println();
	d.draw();
	System.out.println();
	Drawable.staticMethod();
	
}
}
