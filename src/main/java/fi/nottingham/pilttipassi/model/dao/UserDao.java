package fi.nottingham.pilttipassi.model.dao;

import fi.nottingham.pilttipassi.model.obj.User;

public interface UserDao {
	
	public void save(User user);
	public User get(int id);
}
