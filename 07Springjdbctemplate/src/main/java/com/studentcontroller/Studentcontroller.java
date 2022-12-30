package com.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.studentmodel.Student;
import com.studentservice.StudentService;

@Controller
public class Studentcontroller {
	@Autowired
	StudentService service;

	public void save(Student student) {
		service.save(student);
	}

	public void update(Student student) {
		service.update(student);
	}

	public void deletebyid(Integer sid) {
		service.deletebyid(sid);
	}

	public List<Student> findAll() {
		return service.findAll();

	}

}
