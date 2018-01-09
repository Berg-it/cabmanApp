package tn.bergit.cabman.repository.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.bergit.cabman.dto.TestDTO;
import tn.bergit.cabman.service.TestService;

/**
 * 
 * @author ABG
 *
 */
@Service
public class TestServiceImpl implements TestService {

	@Override
	public List<TestDTO> findAllByCategorie(String iCategorieName) {
		// TODO Auto-generated method stub
		return null;
	}

}
