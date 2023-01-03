package com.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.StudentModel.Student;
import com.StudentService.StudentService;
@Controller
public class StudentController {
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

	public Student FindById(Integer sid) {
		return service.FindById(sid);
	}

	public List<Student> FindAll() {
		return service.FindAll();

	}
}
