package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exerciciosJPA");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//construtor
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		super();
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	//métodos
	public DAO<E> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirTransacao().incluir(entidade).fecharTransacao();
	}
	
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int quantidade, int deslocamento){
		
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula"); 
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public E obterPorId(Object id){
		return em.find(classe, id);
	}
	
	public DAO<E> detach(E entidade){
		em.detach(entidade);
		return this;
	}
	
	public DAO<E> merge(E entidade) {
		em.merge(entidade);
		return this;
	}
	
	public DAO<E> deletar(E entidade){
		if(entidade != null) {
			em.remove(entidade);
		} else {
			System.out.println("Não encontrado");
		}
		return this;
	}
	
	public DAO<E> deletarAtomico(E entidade){
		if(entidade != null) {
			return this.abrirTransacao().deletar(entidade).fecharTransacao();
		}
		return this;
	}
	
	
	public List<E> consultar(String nomeConsulta, Object... params){ //método mais flexível
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}
	
	
	public E consultarUm(String nomeConsulta) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		List<E> lista = query.getResultList();
		return lista.get(0);
		
		
	}
	
	
	public DAO<E> fechar(){
		em.close();
		return this;
	}
	
	
	public List<E> ObterTodosComDescricaoAgua(String nomeConsulta){ //método menos flexível pois estou colocando o parâmetro.
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		query.setParameter("descricao", "%agua%"); //Como foi utilizado referência :descricao no JPQL
		//'descricao' condiz com essa referência e o segundo parâmetro é o valor.
		
		return query.getResultList();
	}
	
/*
 * Criando métodos que retornam a própria classe é possível fazer encadeamento de métodos.
 * Colocando a Classe com generics faz com que o DAO seja utilizado por qualquer classe.
 * 
 * */
	
}
