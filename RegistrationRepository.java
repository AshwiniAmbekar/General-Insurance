package com.lti.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.RegistrationEntity;
//@Component
@Repository
public class RegistrationRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insert(RegistrationEntity registration) {
		entityManager.persist(registration);
	}
	
	@Transactional
	public List<RegistrationEntity> fetchAll() {
		Query q=entityManager.createQuery("select obj from RegistrationEntity as obj");
		return q.getResultList();
	}
	
	@Transactional
	public void fetch(RegistrationEntity registration) {
		entityManager.persist(registration);
	}
}
