package com.jeno.jsf;


import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;




@ManagedBean(name = "registerBean")
@SessionScoped
public class RegisterBean implements Serializable {
	private static final long serialVersionUID = -1393234337581937862L;
	private String firstname;
    private String lastname;
    private String username;
    private String password;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String register() {
        return "login?faces-redirect=true";
    }
}
