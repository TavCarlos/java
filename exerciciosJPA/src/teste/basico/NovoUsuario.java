package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("exerciciosJPA");//É responsável por criar e configurar EntityManager.
		//você indica qual banco de dados você deseja conectar através do arquivo persistence e inserindo o nome no emf.
		
		EntityManager em = emf.createEntityManager(); //É responsável por gerenciar as entidades(objetos) e realizar operações de CRUD.
		
		Usuario NovoUsuario = new Usuario("Luisa", "oliveira@olivera.com.br");
		
		em.getTransaction().begin();
		em.persist(NovoUsuario); //inserir no banco de dados o objeto
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
