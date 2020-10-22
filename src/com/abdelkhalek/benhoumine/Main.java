package com.abdelkhalek.benhoumine;

public class Main {

	public static void main(String[] args) {

		ShapeFactory cirlceFactory = new ShapeFactoryCircle() ; 
		Shape circle = cirlceFactory.createShape() ; 
		circle.draw() ; 
		

		
		ShapeFactory squereFactory = new ShapeFactorySquare() ; 
		Shape square = squereFactory.createShape() ; 
		square.draw() ; 
		
	}

}
