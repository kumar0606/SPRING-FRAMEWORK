package com.EmployeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeModel.Employe;
import com.EmployeService.EmployeService;
@Component("empcontroller")
public class EmployeController {
@Autowired
private EmployeService employeservice;	

public void save(Employe employe) {
	System.out.println("controller method");
	employeservice.save(employe);
}
public void update(Employe employe) {
	employeservice.update(employe);
}
public void deleteByid(Integer eid) {
	employeservice.deleteByid(eid);
}
}
