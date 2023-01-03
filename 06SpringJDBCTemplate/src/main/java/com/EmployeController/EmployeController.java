package com.EmployeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.EmployeModel.Employe;
import com.EmployeService.EmployeService;
@Controller
public class EmployeController {
	@Autowired
	EmployeService employeService;

	public void save(Employe employe) {
		employeService.save(employe);
	}

	public void update(Employe employe) {
		employeService.update(employe);
	}

	public void deletebyid(Integer eid) {
		employeService.deletebyid(eid);
	}
	public List<Employe> FindAll(){
		return employeService.FindAll();
		
	}

}
