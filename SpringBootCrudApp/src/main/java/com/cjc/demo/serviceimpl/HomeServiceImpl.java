package com.cjc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.ServiceI.HomeServiceI;
import com.cjc.demo.model.Student;
import com.cjc.demo.repository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Iterable<Student> loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		
		if(username.equals("admin") && password.equals("admin")) {
			Iterable<Student> list =hr.findAll();
			return list;
		}
		else {
			List<Student> l=hr.findByUsernameAndPassword(username,password);
			return  l;
		}
	}

	@Override
	public Iterable<Student> DeleteData(Student s) {
		hr.delete(s);
		Iterable<Student> list =hr.findAll();
		return list;

	}

	@Override
	public Iterable<Student> updateData(Student s) {
			hr.save(s);
		Iterable<Student> list=hr.findAll();
		return list;
	}

	@Override
	public Student editData(int rollno) {
		Student s=hr.findByRollno(rollno);
		return s;
	}

}
