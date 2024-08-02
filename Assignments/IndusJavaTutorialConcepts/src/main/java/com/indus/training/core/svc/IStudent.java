package com.indus.training.core.svc;

import java.util.Objects;

public class IStudent {

	@Override
	public int hashCode() {
		return Objects.hash(grade, marks, studentLastName, studentName, studentPhonenumber, teacher);
	}

	@Override
	public String toString() {
		return "IStudent [studentName=" + studentName + ", studentLastName=" + studentLastName + ", studentPhonenumber="
				+ studentPhonenumber + ", teacher=" + teacher + ", grade=" + grade + ", marks=" + marks
				+ ", hashCode()=" + hashCode() + ", getStudentName()=" + getStudentName() + ", getStudentLastName()="
				+ getStudentLastName() + ", getStudentPhonenumber()=" + getStudentPhonenumber() + ", getTeacher()="
				+ getTeacher() + ", getGrade()=" + getGrade() + ", getMarks()=" + getMarks() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IStudent other = (IStudent) obj;
		return Objects.equals(grade, other.grade) && marks == other.marks
				&& Objects.equals(studentLastName, other.studentLastName)
				&& Objects.equals(studentName, other.studentName) && studentPhonenumber == other.studentPhonenumber
				&& Objects.equals(teacher, IStudent.teacher);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentPhonenumber() {
		return studentPhonenumber;
	}

	public void setStudentPhonenumber(String studentPhonenumber) {
		this.studentPhonenumber = studentPhonenumber;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		IStudent.teacher = teacher;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public IStudent(String studentName, String studentLastName, String studentPhonenumber, String teacher, String grade,
			int marks) {
		super();
		this.studentName = studentName;
		this.studentLastName = studentLastName;
		this.studentPhonenumber = studentPhonenumber;
		IStudent.teacher = teacher;
		this.grade = grade;
		this.marks = marks;
	}

	private String studentName;
	private String studentLastName;
	private String studentPhonenumber;
	public static String teacher;
	private String grade;
	private int marks;

	public IStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
