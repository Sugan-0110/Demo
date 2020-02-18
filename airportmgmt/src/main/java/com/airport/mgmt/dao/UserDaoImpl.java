package com.airport.mgmt.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.airport.mgmt.form.User;

@Repository
public class UserDaoImpl implements UserDao {

	private static Logger log=Logger.getLogger(UserDaoImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside dao's addUser");
		System.out.println(user.getId()+" "+user.getEmail()+" "+user.getFirstName()+" "+user.getGender()+" "+user.getLastName()+" "+user.getUserName()+" "+user.getPassword()+" "+user.getUserType()+user.getApproval()+" "+user.getId());
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		log.info("Inside dao's updateUser");
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from User");
		List l=q.list();
		return l;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from User u where u.id=:id");
		q.setParameter("id", userId);
		User user=(User)q.uniqueResult();
		return user;
	}

	@Override
	public boolean getUserByName(String name,String password,String type) {
		// TODO Auto-generated method stub
		System.out.println("Inside UserDao"+" "+name+" "+password+" "+type);
		Query q=sessionFactory.getCurrentSession().createQuery("from User where user_name=:uName and password=:upass and role=:utype");
		q.setParameter("uName", name);
		q.setParameter("upass", password);
		q.setParameter("utype", type);
		User user=(User)q.uniqueResult();
		if(user==null)
		{
			return false;
		}    
		
		return true;
	}
	
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		User user=(User)sessionFactory.getCurrentSession().get(User.class, userId);
		if(user != null)
		{
			sessionFactory.getCurrentSession().delete(user);
		}
	}
}
