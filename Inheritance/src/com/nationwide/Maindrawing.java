package com.nationwide;

public class Maindrawing {
	public static void main(String[]args) {
		Circle c =new Circle();
		Line l =new Line();
		letsdraw(c);
		letsdraw(l);		
	}
	public static void letsdraw(Draw d) {
		d.letsdraw();
	}
}