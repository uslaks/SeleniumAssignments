package org.student;

import org.department.Department;

// To do multilevel inheritance of Department and College classes by Student class
public class Student extends Department {
	
	public void studentName() {
		
		// Called the methods of College class using super keyword
		super.collegeName();
		super.collegeCode();
		super.collegeRank();
		System.out.println("Student Name: Seethalakshmi");
	}
	
	public void studentDept() {
		
		// Called the method of Department class using super keyword
		super.deptName();
		System.out.println("Student belongs to Physics Department");		
	}
	
	public void studentId() {
		
		// Called the methods of Student (this same) class using this keyword
		this.studentName();
		System.out.println("Student Id is 10256");
		this.studentDept();
	}

	public static void main(String[] args) {
		
		Student detailsofStudent = new Student();
		
		// Called only one method from this class (Student class) as all other required methods (of 14, ml m minherited and this class) have already been called out inside the methods
		detailsofStudent.studentId();
		
	}
	
}
