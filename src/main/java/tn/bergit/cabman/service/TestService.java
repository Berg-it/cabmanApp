package tn.bergit.cabman.service;

import java.util.List;

import tn.bergit.cabman.dto.TestDTO;

public interface TestService {

	
	public List<TestDTO> findAllByCategorie(String iCategorieName);
	
}
