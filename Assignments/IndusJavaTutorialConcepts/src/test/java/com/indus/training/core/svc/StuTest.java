package com.indus.training.core.svc;

import junit.framework.TestCase;

public class StuTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStu() {

		Stu stuObj1 = new Stu("Vinay", "Makineni");

		Stu.setTeacher("Lahari");

		Stu stuObj2 = new Stu("Chandra", "Sadineni");

		Stu.setTeacher("Sumana");

		System.out.println(stuObj1);
		System.out.println(stuObj2);

	}

}
