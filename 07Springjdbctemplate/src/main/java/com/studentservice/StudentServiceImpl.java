package com.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentDAO.StudentDAO;
import com.studentmodel.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO dao;

	public void save(Student student) {
		dao.save(student);

	}

	public void update(Student student) {
		dao.update(student);

	}

	public void deletebyid(Integer sid) {
		dao.deletebyid(sid);

	}

	public List<Student> findAll() {

		return dao.findAll();
	}

}
