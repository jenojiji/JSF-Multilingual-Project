package com.jeno.jsf;

import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;


import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

@ManagedBean(name = "registerBean")
@SessionScoped
public class LanguageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

    public Locale getLocale() {
    	System.out.println("inside getlocale:"+locale);
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
        System.out.println("inside setlocale:"+locale);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }

    public void changeLanguage(String language) {
    	System.out.println(language);
        locale = new Locale(language);
        System.out.println(locale);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        System.out.println(FacesContext.getCurrentInstance().getViewRoot().getLocale());
    }
}

