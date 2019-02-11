package com.lti.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.RegistrationEntity;

@Repository
public class GenericRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insert(Object obj) {
		entityManager.persist(obj);
	}
	
	@Transactional
	public <E> List<E> fetchAll(Class<E> classname){
		Query q=entityManager.createQuery("select obj from " + classname.getName() + "as obj");
		return q.getResultList();
	}
	
	
}
