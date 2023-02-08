package com.empleado.salario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.empleado.salario.modelo.Empleado;

@Service
public class SalarioService {
	
	public Integer contar(String palabra) {		
		return palabra.length();
	}
	
	public Integer sumar(Integer n1, Integer n2) {
		return n1 + n2;
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

		
	public List<Empleado> getEmpleados(){
		List<Empleado> lista= new ArrayList();		
		Empleado e1 = new Empleado();
		e1.setCedula("e1");
		e1.setTipo(4);
		e1.setSalario(500000);
		e1.setPago(getSalarioFinal(
				                  e1.getSalario(),
				                  e1.getTipo())
				   );		
		lista.add(e1);
		
		Empleado e2 = new Empleado();
		e2.setCedula("e2");
		e2.setTipo(1);
		e2.setSalario(600000);
		e2.setPago(getSalarioFinal(
				                  e2.getSalario(),
				                  e2.getTipo())
				   );		
		lista.add(e2);	
	
		
		return lista;
	}
	
	
	
}
