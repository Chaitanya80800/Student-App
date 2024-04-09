package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.demo.ServiceI.HomeServiceI;
import com.cjc.demo.model.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@GetMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/openregpage")
	public String preregister() {
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Student s) {
		hs.saveStudent(s);
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam String username ,@RequestParam String password,Model m) {
		
		Iterable<Student> list=hs.loginCheck(username,password);
		if(list!=null)
		{
			m.addAttribute("data",list);
			return "success";
		}
		else {
			m.addAttribute("msg","User and Password not match");
			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s,Model m) {
		
		Iterable<Student> list=hs.DeleteData(s);
		m.addAttribute("data",list);
		return "success";

		
	}
	

	@RequestMapping("/edit")
	public String editData(@RequestParam int rollno,Model m) {
		
		Student s=hs.editData(rollno);
		m.addAttribute("stu",s);
		return "edit";
		
	}

	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m) {
		
		Iterable<Student > list=hs.updateData(s);
		m.addAttribute("data",list);
		return "success";
		
	}

	
	
}
