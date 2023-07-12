package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //SpringBoot considerar essa classe um controlador do tipo Rest
public class PrimeiroController {

	@GetMapping
	public String ola() {
		return "Ola, Spring Boot!";
	}
	
	@GetMapping(path = {"tudobem", "saudacao"})
	public String tudoBem() {
		return "Tudo bem?";
	}
}

/*
 * Para mapear a execução dos métodos para alguma URL da aplicação utiliza-se anotation.
 * Ou seja, através das anotations é possível mapear as classes e seus métodos para URL e o resultado
 * desses métodos irá ser devolvido para o browser. 
 * 
 * @GetMapping -> mapeamento para um método do tipo get.
 * 
 * path -> Se chegar uma requisição com esse caminho "/tudobem" e for uma requisição do tipo get(@getPapping)
 * ele chamará o tudobem() method.
 * 
 * */
 