package tn.bergit.cabman.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.bergit.cabman.bo.User;
import tn.bergit.cabman.dto.UserByIdResponseDTO;
import tn.bergit.cabman.security.config.JwtTokenUtil;
import tn.bergit.cabman.security.config.JwtUser;
import tn.bergit.cabman.service.UserService;

/**
 * 
 * @author ABG
 *
 */
@RestController
public class UserRestController {

	protected static final Logger LOGGER = LoggerFactory.getLogger(UserRestController.class.getName());
	
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    @Qualifier("sUserServiceImpl")
    private UserService gUserService;
    
    @RequestMapping(value = "user", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }
    
    /**
     * 
     * @param iUserName
     */
    @RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public UserByIdResponseDTO getUserByNAme(@PathVariable Long id) {
    	LOGGER.info("I receive the call with param: {} ",id);
    	User vUser = gUserService.getOne(id);
    	LOGGER.info("vvUser getFirstname: {} ",vUser.getFirstname());
    	/**
    	 * Mapping
    	 */
    	UserByIdResponseDTO vUserByIdResponseDTO = new UserByIdResponseDTO();
    	vUserByIdResponseDTO.setUserName(vUser.getFirstname());
    	
    	return vUserByIdResponseDTO;
    }
    

}
