package com.models;

public class Square implements Figure {

	@Override
	public double calcSquare(double altitude, double side) {
		if (altitude == side && (altitude > 0 && side > 0))
			return altitude * side * 2;
		else 
			return -1;
	}

	@Override
	public void printFigureInfo() {
		System.out.println("This is square");
	}

}
