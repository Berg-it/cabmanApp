package tn.bergit.cabman.service;

import tn.bergit.cabman.bo.User;

public interface UserService {

	
	public User findByUsername(String username);
	public User getOne(Long arg0);
	
}
