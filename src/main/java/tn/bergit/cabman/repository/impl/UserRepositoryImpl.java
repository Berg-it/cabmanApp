package tn.bergit.cabman.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import tn.bergit.cabman.bo.User;
import tn.bergit.cabman.repository.UserRepository;

@Repository("rUserRepositoryImpl")
public class UserRepositoryImpl implements UserRepository {

	private @PersistenceContext EntityManager gEntityManager;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOne(Long arg0) {

		return gEntityManager.find(User.class, arg0);
		
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {


		 TypedQuery<User> query = gEntityManager.createQuery(
			        "SELECT c FROM User c WHERE c.username = :iUsername", User.class);
			    return query.setParameter("iUsername", username).getSingleResult();
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends User> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends User> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
