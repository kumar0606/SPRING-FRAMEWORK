package com.studentservice;

import java.util.List;

import com.studentmodel.Student;

public interface StudentService {

	void save(Student student);

	void update(Student student);

	void deletebyid(Integer sid);

	List<Student> findAll();

}
