/**
 * 
 */
package com.juanmador.project.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Eliezer Clase que nos permite controlar el funcionamiento de la
 *         pantalla con el login.xhtml.
 *
 */
@ManagedBean
public class LoginController {

	/**
	 * Usuario que ingresa en el login
	 */

	private String usuario;

	/**
	 * Contraseña ingresada en el login
	 */
	private String password;

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		// FacesContesxt es una clase del API de JSF
		if (usuario.equals("depredador") && password.equals("12345")) {
			/*FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));*/
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			

		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));

		}
	}

	private void redireccionar(String pagina) throws IOException  {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
