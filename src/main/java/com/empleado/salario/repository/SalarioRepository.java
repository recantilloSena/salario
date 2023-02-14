package com.empleado.salario.repository;

import org.springframework.stereotype.Service;

import com.empleado.salario.modelo.Empleado;

@Service
public class SalarioRepository {
	
	public Empleado createEmpleado(String cedula, Integer tipo, Integer salario) {
		Empleado e = new Empleado();
		e.setCedula(cedula);
		e.setTipo(tipo);
		e.setSalario(salario);
		e.setPago(getSalarioFinal(
				                  e.getSalario(),
				                  e.getTipo())
				   );		
		
		return e;
	}
	
public float getSalarioFinal(Integer salarioBase, Integer tipo) {
		
		float salarioFinal=(float) 0.0;		
		switch (tipo) { 
	    case 1:
	    	salarioFinal = salarioBase + salarioBase*3/100;
	     break;
	    case 2:
	    	salarioFinal = salarioBase + salarioBase*5/100;
	     break;
	    case 3:
	    	salarioFinal = salarioBase + salarioBase*10/100;
	     break;  
	    case 4:
	    	salarioFinal = salarioBase + salarioBase*15/100;
	     break;   	     
	    default:	    
	    	salarioFinal = salarioBase ;
	     break;	     
	  }	
		return salarioFinal;
		
	}

}
