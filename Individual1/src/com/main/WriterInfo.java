package com.main;

import com.models.StudentB;

public class WriterInfo {
	private StudentB student;
	
	public WriterInfo(StudentB student) {
		this.student = student;
	}
	
	public void printStudentLastName() {
		System.out.println("Student last name: " + student.getLastName());
	}
	
	public void printStudentAge() {
		System.out.println(String.format("%s is now %d years old", student.getLastName(), student.getAge()));
	}
	
	public void printStudentInfo() {
		String info = String.format("Student last name: %s; Age: %d; Is Debtor: %b", student.getLastName(), student.getAge(), student.isDebtor());
		System.out.println(info);
	}
}
