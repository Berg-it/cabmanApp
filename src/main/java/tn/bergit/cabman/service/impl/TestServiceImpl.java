package tn.bergit.cabman.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import tn.bergit.cabman.dto.TestDTO;
import tn.bergit.cabman.repository.TestRepository;
import tn.bergit.cabman.service.TestService;

/**
 * 
 * @author ABG
 *
 */
@Service
public class TestServiceImpl implements TestService {

	
	@Autowired
	TestRepository gTestRepository;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly=true)
	public List<TestDTO> findAllByCategorie(String iCategorieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly=true)
	public void testFn() {
		gTestRepository.testFn();
	}

}
