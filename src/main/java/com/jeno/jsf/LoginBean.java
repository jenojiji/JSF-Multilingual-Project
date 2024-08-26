package com.jeno.jsf;

import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.bean.ManagedBean;
import jakarta.inject.Named;

@SessionScoped
@ManagedBean(name = "loginBean")
public class LoginBean implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;


	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 public String login() {
	        if ("admin".equals(username) && "admin".equals(password)) {
	            return "index?faces-redirect=true";
	        } else {
	            return "login?faces-redirect=true";
	        }
	    }
}
