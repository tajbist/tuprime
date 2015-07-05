package com.ugurcanlacin.sportclubsystem.dao.impl;

import org.hibernate.SessionFactory;

import com.ugurcanlacin.sportclubsystem.dao.DietDao;
import com.ugurcanlacin.sportclubsystem.model.Diet;

public class DietDaoImpl extends GenericDaoImpl<Diet> implements DietDao{
	private SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
