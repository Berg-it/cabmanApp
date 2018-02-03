package tn.bergit.cabman.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.bergit.cabman.bo.User;
import tn.bergit.cabman.repository.UserRepository;
import tn.bergit.cabman.service.UserService;

@Service("sUserServiceImpl")
public class UserServiceImpl implements UserService {

	
	@Autowired
	@Qualifier("rUserRepositoryImpl")
	public UserRepository gUserRepository;

	@Override
	public User findByUsername(String iUsername) {
		return gUserRepository.findByUsername(iUsername);
	}

	@Override
	public User getOne(Long arg0) {
		// TODO Auto-generated method stub
		return gUserRepository.getOne(arg0);
	}
	
	
}
