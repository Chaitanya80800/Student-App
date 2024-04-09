package com.cjc.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student,Integer> 
{

	public List<Student> findByUsernameAndPassword(String username, String password);

	public Student findByRollno(int rollno);

	

}
