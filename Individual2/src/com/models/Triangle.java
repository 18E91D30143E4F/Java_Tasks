package com.models;

public class Triangle implements Figure {

	@Override
	public double calcSquare(double altitude, double side) {
		if (altitude > 0 && side > 0)
			return 0.5 * altitude * side;
		else 
			return -1;
	}

	@Override
	public void printFigureInfo() {
		System.out.println("This is triangle");
	}

}
