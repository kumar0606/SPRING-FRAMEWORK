package com.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.EmployeDAO.EmployeDAO;
import com.EmployeModel.Employe;
@Repository
public class EmployeServiceImpl implements EmployeService{
@Autowired

	private EmployeDAO employeDAO;
	public void save(Employe employe) {
		System.out.println("service method");
		employeDAO.save(employe);
	}
public void update(Employe employe) {
	employeDAO.update(employe);
}
public void deleteByid(Integer eid) {
	employeDAO.deleteByid(eid);
	
}
}
