package fi.nottingham.pilttipassi.model.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fi.nottingham.pilttipassi.model.dao.UserDao;
import fi.nottingham.pilttipassi.model.obj.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User get(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, id);

		return user;
	}

}
