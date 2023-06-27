package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciosJPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 1L);
		
		usuario.setNome("Carlos");
		usuario.setEmail("carlos@carlos.com");
		
		em.merge(usuario); //responsável por efetivamente alterar o banco de dados
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
	}
}
