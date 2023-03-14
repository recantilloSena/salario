package com.empleado.salario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.salario.modelo.Empleado;
import com.empleado.salario.repository.SalarioRepository;

@Service
public class SalarioService {
	
	@Autowired
	SalarioRepository salarioRepository;
	
	public Integer contar(String palabra) {		
		return palabra.length();
	}
	
	public Integer sumar(Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	

		
	public List<Empleado> getEmpleados(){
		List<Empleado> lista= new ArrayList<Empleado>();
				
		lista.add(salarioRepository.createEmpleado("E1", 1, 200000));
		lista.add(salarioRepository.createEmpleado("E2", 4, 500000));
			
		
		return lista;
	}

	public float getSalarioFinal(Integer salario, Integer tipo) {		
		return salarioRepository.getSalarioFinal(salario, tipo);
	}
	
	
	
	
	
	
}
