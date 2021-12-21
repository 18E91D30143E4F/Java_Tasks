package com.models;

import java.util.ArrayList;

public class StudentB {
	private String lastName;
	private int age;
	private ArrayList<String> namesDeptorDisciplines = new ArrayList<String>();

	public StudentB(String lastName) {
		this.lastName = lastName;
	}
	
	public StudentB(String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
	}
	
	public StudentB(String lastName, int age, ArrayList<String> namesDeptorDisciplines) {
		this.lastName = lastName;
		this.age = age;
		this.namesDeptorDisciplines = namesDeptorDisciplines;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDebtor() {
		return !namesDeptorDisciplines.isEmpty();
	}

	public ArrayList<String> getNamesDeptorDisciplines() {
		return namesDeptorDisciplines;
	}

	public void setNamesDeptorDisciplines(ArrayList<String> namesDeptorDisciplines) {
		this.namesDeptorDisciplines = namesDeptorDisciplines;
	}
}
