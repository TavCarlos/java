package com.example.exerciciossb.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.exerciciossb.models.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	@Query("SELECT p FROM Produto P WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> SearchByNameLike(@Param("nome") String nome);
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
 * ---------------------------------------------------------------------------------*
 * Com o PagingAndSortingRepository é possível realizar a paginação com .findAll dos
 * dados que estão na tabela. Assim se eu tiver uma tabela com 50 mil dados, posso 
 * ir mostrando de 50 a 50. Com isso eu tenho um maior desempenho.
 * 
 * --------------------------------------------------------------------------------*
 * O método FindBy{nomeVariável} é uma declaração personalizada que procura por produtos cujo nome 
 * contenha uma determinada parte de texto.
 * É um método dentro da interface que não há necessidade de ser implementada
 * Pois o Spring utiliza a convenção para criar consultas automaticamente com base nos nomes dos métodos e seus parâmetros.
 * 
 * Caso a consulta da convenção não satisfazer as demandas do código é possível utilizar annotation
 * @Query(JPQL);
 * 
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
 * https://docs.spring.io/spring-data/jpa/docs/2.5.0/reference/html/#jpa.repositories
 * https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-documentation
 * */
