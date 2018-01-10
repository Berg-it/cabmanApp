package tn.bergit.cabman.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import tn.bergit.cabman.bo.Authority;
import tn.bergit.cabman.repository.TestRepository;

@Repository
public class TestRepositoryImpl  implements TestRepository{

	
	private @PersistenceContext EntityManager gEntityManager;
	
	@Override
	public void testFn() {
		Authority vAuthority =  gEntityManager.find(Authority.class, 1L);
		
		System.out.println("vAuthority "+ vAuthority.getId() ); 
	}

}
