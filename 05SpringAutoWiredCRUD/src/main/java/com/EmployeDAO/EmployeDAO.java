package com.EmployeDAO;

import com.EmployeModel.Employe;

public interface EmployeDAO {

	void save(Employe employe);
void update(Employe employe);
void deleteByid(Integer eid);
}
