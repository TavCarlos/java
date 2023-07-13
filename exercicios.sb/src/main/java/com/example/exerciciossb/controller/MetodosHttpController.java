package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "requisição GET";
	}
	
	@PostMapping
	public String post() {
		return "requisição POST";
	}
	
	@PutMapping
	public String put() {
		return "requisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "requisição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "requisição DELETE";
	}
	
	/*
	 * GET -> Obter/ler informação do servidor.
	Não causa alteração ou efeito colateral no servidor


	* POST -> Alterar dados do servidor.
	exemplo: cadastrar uma informação no banco de dados.
	Via de regra é utilizado quando você quer inserir novos dados no servidor.(cadastrar alguma coisa).

	* PUT -> Altera dados do servidor.
	Em via de regra é utilizado quando você quer alterar dados já existentes no servidor. 
	É utilizado quando você tem uma alteração total(vários atributos).

	* PATCH -> Altera dados do servidor.
 	É utilizado quando você quer alterar dados já existentes no servidor. 
 	É utilizado quando tem uma alteração parcial no servidor(somente um atributo);

-------Pesar da diferenciação de PUT e PATCH, o método PUT é o mais utilizado, não levando muito em 
		consideração essa questão de alteração total ou parcial. --------------

	* DELETE -> Altera dados do servidor.
	Ele irá excluir algo do servidor.


	* OPTIONS -> vai retornar quais métodos http aquela URL suporta. 
	Você consegue ter uma descrição daquela URL

	* TRACE -> faz requisição de teste. look back.

	* HEAD -> parecido com o get. Porém com get você tem um corpo da resposta (response body). 
	  Com o HEAD você recebe a mesma resposta sem o conteúdo. Pode utilizar para saber se uma URL está funcionando.
	  
	 * */
}
