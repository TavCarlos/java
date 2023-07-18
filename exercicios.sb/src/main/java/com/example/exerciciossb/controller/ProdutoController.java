package com.example.exerciciossb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.entity.Produto;
import com.example.exerciciossb.models.repository.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
//	@PostMapping
//	public Produto novoProduto(@RequestParam String nome, 
//								@RequestParam double preco, 
//								@RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto); //irá presistir/alterar o produto no banco de dados.
//		return produto;
//	}
	
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterTodosProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id){
		return produtoRepository.findById(id);
	}

//	@PutMapping
//	public Produto AtualizarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}

}

/*
 * Autowired -> com ela o desenvolvedor não precisará instanciar o objeto para ter acesso 
 * a determinados métodos. Sendo assim, não precisei instânciar a interface ProdutoRepository.
 * (injeção de dependência)
 * Com o Autowired, a spring irá instânciar o objeto automaticamente.
 * 
 * @Valid -> Irá verificar se o parâmetro passado cumpre todos os requisitos de validação.
 * 
 * @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) -> o .save faz tanto o 'post' quanto o 'put'
 * com isso, para haver somente um método que atenda as duas requisições, utiliza-se requestMapping
 * 
 * 
 * */
