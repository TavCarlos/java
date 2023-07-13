package com.example.exerciciossb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.ClienteTeste;
import com.example.exerciciossb.models.DependenteTeste;
import com.example.exerciciossb.models.EnderecoTeste;

@RestController
@RequestMapping(path = "/clientesTeste")
public class ClienteTesteController {

	@GetMapping(path = "/json")
	public ClienteTeste obterClientesJson() {
		DependenteTeste dependente = new DependenteTeste(10, "Carlos Hanze");
		List<DependenteTeste> listaDependentes = new ArrayList<>();
		listaDependentes.add(dependente);
		
		EnderecoTeste endereco = new EnderecoTeste("Rua ABC", 67);
		return new ClienteTeste(1224, "Maria Hanze", "20/06/1996", true, endereco, listaDependentes);
	
	}
}
