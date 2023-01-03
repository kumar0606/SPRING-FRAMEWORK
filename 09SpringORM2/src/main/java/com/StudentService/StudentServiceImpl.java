package com.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.StudentModel.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	HibernateTemplate hibernatetempl;

	@Override
	public void save(Student student) {
		hibernatetempl.save(student);
	}

	@Override
	public void update(Student student) {
		hibernatetempl.update(student);
	}

	@Override
	public void deletebyid(Integer sid) {
		Student student = new Student();
		student.setSid(sid);
		hibernatetempl.delete(sid);
	}

	@Override
	public Student FindById(Integer sid) {
		return hibernatetempl.get(Student.class, sid);
	}

	@Override
	public List<Student> FindAll() {
		return hibernatetempl.loadAll(Student.class);
	}

}
