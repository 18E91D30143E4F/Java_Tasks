package com.models;

import java.util.ArrayList;

public class StudentA {
	private String lastName;
	private int age;
	private ArrayList<String> namesDeptorDisciplines;
	
	public StudentA(String lastName, int age, ArrayList<String> namesDeptorDisciplines) {
		this.lastName = lastName;
		this.age = age;
		this.namesDeptorDisciplines = namesDeptorDisciplines;
	}

	public void printStudentLastName() {
		System.out.println("Last name: " + this.lastName);
	}
	
	public void printStudentAge() {
		System.out.println("Age is: " + this.age);
	}

	public void printIndebtedness() {
		System.out.println("Arrears: ");
		for (String arrear :  namesDeptorDisciplines)
			System.out.println(arrear);
			
	}
	
	public void printStudentInfo() {
		System.out.println(String.format("Student last name: %s; Age: %d; Is Debtor: %b", this.lastName, this.age, this.namesDeptorDisciplines));
	}
}
