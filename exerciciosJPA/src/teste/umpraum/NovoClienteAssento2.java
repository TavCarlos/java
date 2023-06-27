package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("7G");
		Cliente cliente = new Cliente("Leticia", assento);
		
		
		DAO<Cliente> dao = new DAO<>();
		dao.incluirAtomico(cliente);
		
	}
}
/*
 * Para realizar essa operação eu preciso persistir primeiro o 'assento' para depois persistir o 'cliente', pois primeiro
 * precisa existir um 'assento' para ele se relacionar com o 'cliente'.
 * 
 *  Mas caso queira fazer de forma automatizada, basta utilizar a anotation @joinToOne(cascade) no atributo.
 *  Com isso o próprio JPA vai entender a relação dos dois objetos e irá criar automaticamente a persistência do objeto
 *  'assento'
 *  
 */
