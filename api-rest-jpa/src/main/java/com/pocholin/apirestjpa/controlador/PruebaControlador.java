package com.pocholin.apirestjpa.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaControlador {
	
	@GetMapping(value="/")
	public void pruebaInicial() {
		
		System.out.println("Prueba Inicial Ok !!!!!!!!!!!!!");
		
	}

}
