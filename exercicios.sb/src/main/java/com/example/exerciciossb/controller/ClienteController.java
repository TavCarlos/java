package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Carlos", "123.456.789-00");
	}


	@GetMapping(path = "/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "David", "111.222.333-00");
	}
}
/*
 * Quando você retorna um Objeto(cliente), na página URL será diponibilizado as informações
 * em formato JSON.
 * 
 * @RequestMapping -> para acessar os métodos dessa classe é necessário utilizar '/clientes'
 * 
 * /{id} -> depois de '/clientes' irá receber um valor qualquer e com
 * @PathVariable -> pegará o valor que estará na URL e passará como parâmetro para dentro do método.
 * Utilizar os parâmetros através do caminho(path) não é o usual.
 * 
 * @RequestParam -> utilizo os parâmetros passados na URL para dentro do método.
 * É a forma mais usual de fazer.
 * Através dele, eu estou esperando um parâmetro chamado 'id', caso receba ele irá inserir dentro de 'int id'. 
 * Como não é feito através de path, para acessar a url é: 'localhost:8080/clientes?id='
 * 
 * */
 