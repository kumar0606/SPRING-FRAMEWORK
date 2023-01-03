package com.EmployeDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.EmployeModel.Employe;
@Repository
public class JdbcTemplateimpl implements EmployeDAO {
@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Employe employe) {
		jdbcTemplate.update("INSERT INTO EMPLOYEJDBC VALUES(?,?,?)",
				new Object[] { employe.getEid(), employe.getEname(), employe.getEsal() });

	}

	public void update(Employe employe) {
		jdbcTemplate.update("UPDATE EMPLOYEJDBC SET ENAME=? ,ESAL=? WHERE EID=?",
				new Object[] { employe.getEname(), employe.getEsal(), employe.getEid() });

	}

	public void deletebyid(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMPLOYEJDBC WHERE EID=?", new Object[] { eid });

	}

	public List<Employe> FindAll() {
		
		return jdbcTemplate.query("SELECT*FROM EMPLOYEJDBC", new BeanPropertyRowMapper(Employe.class));
	}

}
