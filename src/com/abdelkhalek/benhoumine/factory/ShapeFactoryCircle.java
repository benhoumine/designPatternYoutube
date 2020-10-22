package com.abdelkhalek.benhoumine.factory;

public class ShapeFactoryCircle extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle() ;
	}
	

}
