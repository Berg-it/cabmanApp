package tn.bergit.cabman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.bergit.cabman.dto.TestDTO;
import tn.bergit.cabman.service.TestService;

/**
 * 
 * @author ABG
 *
 */

@RestController
@RequestMapping(value = "api/cabman")
public class TestController extends BaseController {

	
	private @Autowired TestService gTestService;
	
	
	
	/**
	 * 
	 * @param iCategorieName
	 * @return
	 */
	@RequestMapping(path = "findByCat/{categorieName}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TestDTO> findAllByCategorie(@PathVariable("categorieName") String iCategorieName)
	{
		LOGGER.info("TestController::findAllByCategorie::Données reçus {}", iCategorieName);
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		List<TestDTO> vRp = gTestService.findAllByCategorie(iCategorieName);
		
		return vRp;
	}
	
	
	
}
