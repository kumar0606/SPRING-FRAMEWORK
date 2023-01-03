package com.EmployeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EmployeModel.Employe;
@Service
@Transactional
public class EmployeServiceImpl implements EmployeService {
	@Autowired
	
	HibernateTemplate  hibernateTemplate;
	

	public void save(Employe employe) {
		hibernateTemplate.save(employe);

	}

	public void update(Employe employe) {
		hibernateTemplate.update(employe);

	}

	public void deletebyid(Integer eid) {
		Employe emp=new Employe();
		emp.setEid(eid);
		hibernateTemplate.delete(emp);

	}

	public List<Employe> FindAll() {
		
		return hibernateTemplate.loadAll(Employe.class);
	}

	@Override
	public Employe Findbyid(Integer eid) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Employe.class, eid);
	}

}
