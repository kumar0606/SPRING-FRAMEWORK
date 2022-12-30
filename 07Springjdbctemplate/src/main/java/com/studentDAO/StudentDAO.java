package com.studentDAO;

import java.util.List;

import com.studentmodel.Student;

public interface StudentDAO {

	void save(Student student);

	void update(Student student);

	void deletebyid(Integer sid);
	
	List<Student> findAll();

}
