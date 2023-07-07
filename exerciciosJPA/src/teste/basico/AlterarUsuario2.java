package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exerciciosJPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L); 
		em.detach(usuario);
		
		usuario.setNome("Carlos");
		
		em.merge(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	/*
	 * Quando um objeto está em estado GERENCIADO, qualquer alteração
	 * feita em suas propriedades será automaticamente refletida no banco de dados durante a próxima 
	 * sincronização com a unidade de persistência.
	 * 
	 *  Com isso, para evitar essa automaticidade é possível colocar o em.detach(); sendo assim
	 *  para ocorrer uma alteração é preciso utilizar explicitamente o em.merge.
	 *  
	 *  Usuario.class como parâmetro -> o JPA precisa da classe para fazer o processo de
	 *  introspecção, entender como ele vai pegar o resultado do banco de dados e
	 *  jogar isso para dentro dos obejetos.
	 **/
	
}
