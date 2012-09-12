package fi.nottingham.pilttipassi.model.dao;

import org.springframework.stereotype.Repository;

import fi.nottingham.pilttipassi.model.obj.User;

@Repository
public interface UserDao {
	
	public void save(User user);
	public User get(int id);
}
