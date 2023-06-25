package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciosJPA");
		EntityManager em = emf.createEntityManager();
		
		
		String jpql = "select u from Usuario u"; 
		//TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		//query.setMaxResults(6);
		
		List<Usuario> usuarios = em
				.createQuery(jpql, Usuario.class)
				.setMaxResults(6)
				.getResultList();		
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() +
					" Nome: " + usuario.getNome() + " email: " + usuario.getEmail());
		}
	}
}