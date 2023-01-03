package com.EmployeService;

import java.util.List;

import com.EmployeModel.Employe;

public interface EmployeService {

	void save(Employe employe);

	void update(Employe employe);

	void deletebyid(Integer eid);

	Employe Findbyid(Integer eid);

	List<Employe> FindAll();

}
