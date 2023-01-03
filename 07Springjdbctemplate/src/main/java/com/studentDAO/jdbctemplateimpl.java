package com.studentDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.MappingReppers.MappingReppers;
import com.studentmodel.Student;

@Repository
public class jdbctemplateimpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbctemplate;

	public void save(Student student) {
		jdbctemplate.update("INSERT INTO STUDENTJDBC VALUES(?,?,?)",
				new Object[] { student.getSid(), student.getSname(), student.getSfee() });
		
	}

	public void update(Student student) {
		jdbctemplate.update("UPDATE STUDENTJDBC SET SNAME=?,SFEE=? WHERE SID=?",
				new Object[] { student.getSname(), student.getSfee(), student.getSid() });
		
	}

	public void deletebyid(Integer sid) {
		jdbctemplate.update("DELETE FROM STUDENTJDBC WHERE SID=?", new Object[] { sid });

	}

	public List<Student> findAll() {

		// return jdbctemplate.query("SELECT*FROM STUDENTJDBC", new MappingReppers()) ;

		// this is another type by using class name
		return jdbctemplate.query("SELECT*FROM STUDENTJDBC", new BeanPropertyRowMapper(Student.class));
	}

}
