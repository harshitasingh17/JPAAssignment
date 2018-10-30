package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory emFact=null;
	static EntityManager entityManager=null;
	
	public static EntityManager getEntityManager() // this method give us entity manager
	{
		emFact=Persistence.createEntityManagerFactory("JPA-PU-Oracle"); //persistence unit of oracle
		entityManager=emFact.createEntityManager();
		return entityManager;
	}
}
