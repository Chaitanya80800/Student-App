package com.cjc.demo.ServiceI;

import java.util.List;

import com.cjc.demo.model.Student;

public interface HomeServiceI {

	public void saveStudent(Student s);

	public Iterable<Student> loginCheck(String username, String password);

	public Iterable<Student> DeleteData(Student s);

	public Student editData(int rollno);
	
	public Iterable<Student> updateData(Student s);

	

}
