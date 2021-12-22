package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.models.*; 

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input value: ");
		int value = in.nextInt();

		ArrayList<Figure> figures = new ArrayList<Figure>();
		Figure square = new Square();
		Figure triangle = new Triangle();
		
		figures.add(square);
		figures.add(triangle);
		
		System.out.println("Less: ");
		for (Figure figure : figures)
			SearchInfo.findBySquareLess(figure, 5, 5, value);
		
		System.out.println("Lager: ");
		for (Figure figure : figures)
			SearchInfo.findBySquareLarger(figure, 5, 5, value);
	}
}
