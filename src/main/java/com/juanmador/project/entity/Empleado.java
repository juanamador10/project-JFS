/**
 * 
 */
package com.juanmador.project.entity;

/**
 * @author Juan Fernando Amador Miranda
 * Clase que representa entidades de Empleados
 *
 */
public class Empleado {
	/**
	 * Nombre del empleado
	 */
	private String nombre;
	/**
	 * 	Primer apellido del empleado
	 */
	private String primerApellido;
	/**
	 * Segundo apellido del empleado
	 */
	private String segundoApellido;
	/**
	 * Puesto del empleado
	 */
	private String puesto;
	/**
	 * Estado actual del empleado
	 */
	private boolean estatus;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	

}
