/**
 * 
 */
package com.juanmador.project.service;
import java.util.ArrayList;
import java.util.List;

import com.juanmador.project.entity.Empleado;


/**
 * @author Juan Fernando Amador Miranda
 * Clase que permite realizar la logica de negocio para empleados
 *
 */
public class EmpleadoService {
	
	/**
	 *
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 *
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
	
		empleadoIBM.setNombre("Victor");
		empleadoIBM.setPrimerApellido("Ramirez");
		empleadoIBM.setSegundoApellido("Gonzales");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Altamira");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Hernanadez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}

}
