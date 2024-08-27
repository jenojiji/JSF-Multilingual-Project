package com.jeno.jsf;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.faces.context.FacesContext;


import java.io.Serializable;


@ManagedBean(name = "logoutBean")
@SessionScoped
public class LogoutBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }
}
