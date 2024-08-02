package com.indus.training.core.svc;

import junit.framework.TestCase;

public class StudentTest1 extends TestCase {
	
	public void testSetStudentName() {
		
		IStudent student1 = new IStudent();
		IStudent student2 = new IStudent();
		
		student1.setStudentName("Vinay");
		student1.setStudentLastName("Makineni");
		student1.setStudentPhonenumber("8126062659");
		student1.setTeacher("Vivek");
		student1.setGrade("A");
		student1.setMarks(99);
		student2.setStudentName("Chandra");
		student2.setStudentLastName("Rakineni");
		student2.setStudentPhonenumber("8126062658");
		student2.setTeacher("Vi");
		student2.setGrade("A");
		student2.setMarks(99);

		System.out.println(student1);
		System.out.println(student2);
	}

}
