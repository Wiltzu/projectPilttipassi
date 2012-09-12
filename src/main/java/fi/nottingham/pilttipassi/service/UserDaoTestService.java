package fi.nottingham.pilttipassi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fi.nottingham.pilttipassi.model.dao.impl.UserDaoImpl;
import fi.nottingham.pilttipassi.model.obj.User;

@Service
public class UserDaoTestService {
	
	@Autowired
	private UserDaoImpl userDao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public String doDBShit(String name) {
		User testi = new User();
		testi.setName(name);
		
		userDao.save(testi);
		
		testi = null;
		
		testi = userDao.get(1);
		return testi.getName();
	}
}
