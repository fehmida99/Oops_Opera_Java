package com.Multiple_Inheritance;

public class Main implements Drawable,Printable {
	
	
	@Override
	public void print() {
		System.out.println("I am printing");
	}
	
	@Override
	public void draw() {
		System.out.println("I am drawing");
	}
	
	
	
	
	
public static void main(String[] args) {
	
//	Drawable d = new Main();
//	d.draw();
//	
//	Printable p = new Main();
//	p.print();
	
	
	Main mm = new Main();
	mm.draw();
	mm.print();
	
	
}
}
