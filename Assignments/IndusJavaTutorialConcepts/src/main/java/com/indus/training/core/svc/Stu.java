package com.indus.training.core.svc;

public class Stu {

	private String firstName;
	private String lastName;
	private static String teacher;
	
	@Override
	public String toString() {
		return "Stu [firstName = " + firstName + ", lastName = " + lastName + ", TeacherName = " + Stu.teacher + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Stu(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static String getTeacher() {
		return teacher;
	}

	public static void setTeacher(String teacher) {
		Stu.teacher = teacher;
	}
	
	
	
	
	
}
