# lab1
package com;

public class Student {
	private String studentName;
	private int marks;
	private String semester;
	public Student() {}
	public Student(String studentName, int marks, String semester) {
		this.studentName = studentName;
		this.marks = marks;
		this.semester = semester;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	

}