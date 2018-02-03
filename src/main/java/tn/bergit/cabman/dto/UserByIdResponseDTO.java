package tn.bergit.cabman.dto;

import java.io.Serializable;

public class UserByIdResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7609869525732512111L;
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
