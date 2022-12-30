package com.EmployeService;

import com.EmployeModel.Employe;

public interface EmployeService {

	void save(Employe employe);
   void update(Employe employe);
	void deleteByid(Integer eid);

}
