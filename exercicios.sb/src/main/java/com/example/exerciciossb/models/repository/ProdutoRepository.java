package com.example.exerciciossb.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.exerciciossb.models.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}

/*
 * Repositório é uma classe ou interface com métodos que você irá utilizar em outras classes.
 * 
 * Há três repositórios muito utilizados:
 * 1 - CrusRepository
 * 2 - JPARepository
 * 3 - Repository
 * 
 * Cada uma delas dispõe de comandos SQL diferentes.
 * 
 * Sendo assim, ao invés de utilizar "SELECT * FROM produto"
 * é possível utilizar o .findAll dentro do código, através dos
 * repositórios.
 * 
 * */
