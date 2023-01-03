package com.EmployeDAO;

import java.util.List;

import com.EmployeModel.Employe;

public interface EmployeDAO {

	void save(Employe employe);

	void update(Employe employe);

	void deletebyid(Integer eid);

	List<Employe> FindAll();

}
