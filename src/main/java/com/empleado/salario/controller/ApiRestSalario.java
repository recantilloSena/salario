package com.empleado.salario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.salario.modelo.Empleado;
import com.empleado.salario.service.SalarioService;

@RestController
@RequestMapping("/api")
public class ApiRestSalario {

	@Autowired
	SalarioService salarioService;
	
	@GetMapping("/hola")
	String hola() {
		return "Hola Rest";
	}
	
	@GetMapping("/contar/{palabra}")
	Integer totalCaracteres(@PathVariable String palabra) {		
		return salarioService.contar(palabra);		
	}
	
	@GetMapping("/sumar/{numero1}/{numero2}")
	Integer sumar(@PathVariable("numero1") Integer n1, 
			      @PathVariable("numero2")Integer n2) {		
		return salarioService.sumar(n1, n2);		
	}
	
	@GetMapping("/getSalario/{salario}/{tipo}")
	float getSalarioFinal(@PathVariable("salario") Integer salario, 
			                @PathVariable("tipo")Integer tipo) {		
		return salarioService.getSalarioFinal(salario, tipo);		
	}
	
	@GetMapping("/getEmpleados")
	List<Empleado> getEmpleados(){
		return salarioService.getEmpleados();
		
	}
	
	
	
}
