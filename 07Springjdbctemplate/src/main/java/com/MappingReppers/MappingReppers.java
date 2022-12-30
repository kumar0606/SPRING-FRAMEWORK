package com.MappingReppers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.studentmodel.Student;

public class MappingReppers implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st=new Student();
		st.setSid(rs.getInt(1));
		st.setSname(rs.getString(2));
		st.setSfee(rs.getDouble(3));
		return st;
	}

}
