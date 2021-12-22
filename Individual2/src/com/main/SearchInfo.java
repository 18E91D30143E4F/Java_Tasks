package com.main;

import com.models.Figure;

public class SearchInfo {
	static public void findBySquareLess(Figure figure, double altitude, double side, double value) {
		double square = figure.calcSquare(altitude, side);
		if (square < value) {
			figure.printFigureInfo();
			// Hashcode - unique number (nearly)
			System.out.println(String.format("Detected. Expected < %s. Gotten value: %s. Hashcode: %d", value, square, figure.hashCode()));	
		}
	}
	
	static public void findBySquareLarger(Figure figure, double altitude, double side, double value) {
		double square = figure.calcSquare(altitude, side);
		if (square > value) {
			figure.printFigureInfo();
			// Hashcode - unique number (nearly)
			System.out.println(String.format("Detected. Expected > %s. Gotten value: %s. Hashcode: %d", value, square, figure.hashCode()));		
		}
	}
}
