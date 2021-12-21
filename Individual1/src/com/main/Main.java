package com.main;

import com.models.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StudentA studA = new StudentA("������", 19, new ArrayList<String>(Arrays.asList("����������", "������")));
		studA.printStudentLastName();
		studA.printStudentAge();
		studA.printStudentInfo();
		studA.printIndebtedness();
		
		System.out.println("------------------------");
		
		StudentB studB = new StudentB("�������");
		studB.setAge(20);
		
		ArrayList<String> arrears = new ArrayList<String>();
		studB.setNamesDeptorDisciplines(arrears);
		
		WriterInfo writer = new WriterInfo(studB);
		writer.printStudentLastName();
		writer.printStudentAge();
		writer.printStudentInfo();
	}

}
