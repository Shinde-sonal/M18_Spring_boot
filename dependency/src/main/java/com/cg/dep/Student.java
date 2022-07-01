package com.cg.dep;

public class Student {
private String StudentName;
private int id;

public void setId(int id) {
	this.id = id;
}

public void setStudentName(String studentName) {
	this.StudentName = studentName;
}

void display() {
	System.out.println("My name is "+StudentName+" and id is "+id);
}


}
