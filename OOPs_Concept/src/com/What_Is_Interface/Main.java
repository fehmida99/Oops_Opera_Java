package com.What_Is_Interface;

public class Main {
public static void main(String[] args) {
	//By creating object of class.
//	DrawCircle dc = new DrawCircle();
//	dc.draw();
//	
//	DrawRect dr = new DrawRect();
//	dr.draw();
	
	
	//here in left side Interface name & in the R.H.S class name
	//new keyword is with class name so it means we are creating obj of class.
	Drawable d = new DrawCircle();
	d.draw();
	
	d = new DrawRect();
	d.draw();
	
	
}
}
