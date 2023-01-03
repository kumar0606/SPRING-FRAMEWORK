package com.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentModel.Student;
@Service
public interface StudentService {

	void save(Student student);

	void update(Student student);

	void deletebyid(Integer sid);

	Student FindById(Integer sid);

	List<Student> FindAll();

}
