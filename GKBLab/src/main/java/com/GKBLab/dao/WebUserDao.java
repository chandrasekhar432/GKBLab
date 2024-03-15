package com.GKBLab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.GKBLab.dto.WebUser;

@Component
public class WebUserDao {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public WebUser save(WebUser webUser) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		if(webUser!=null) {
			entityTransaction.begin();
			entityManager.persist(webUser);
			entityTransaction.commit();
		}
		return webUser;
	}
	
	public List<WebUser> getAll(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from WebUser a");
		
		List<WebUser> list = query.getResultList();
		
		return list;
 	}
	

}
