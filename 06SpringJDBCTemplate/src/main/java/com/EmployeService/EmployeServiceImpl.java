package com.EmployeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeDAO.EmployeDAO;
import com.EmployeModel.Employe;
@Service
public class EmployeServiceImpl implements EmployeService {
	@Autowired
	EmployeDAO employeDAO;

	public void save(Employe employe) {
		employeDAO.save(employe);

	}

	public void update(Employe employe) {
		employeDAO.update(employe);

	}

	public void deletebyid(Integer eid) {
		employeDAO.deletebyid(eid);

	}

	public List<Employe> FindAll() {
		
		return employeDAO.FindAll();
	}

}
