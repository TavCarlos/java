package classe;

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object objeto){ //aqui vai especificar quais as comparações que será feita pelo
		//.equals na classe Equals.java
		
		
		Usuario outro = (Usuario) objeto; //vai tentar converter o objeto que foi passado como parâmetro
		//no caso foi o 'u2' passado como parâmetro para ser transformado em Usuario.
		//processo identico ao casting: "int a = 5; double b = (double) a; 
	
		if(objeto instanceof Usuario) { //se o objeto for convertido em Usuario com sucesso:
			//instanceof -> verifica se um objeto é instância de uma determinada classe.
			
			boolean nomeIgual = outro.nome.equals(this.nome); //verificar se o nome do u2 é igual ao nome do u1 
			boolean emailIgual = outro.email.equals(this.email); //verificar se o email do u2 é igual ao email do u1
			
			return nomeIgual && emailIgual; //retornará ao método equals
			
		} else {
			return false;
		}
	}
	
	/*
	 outro.nome e outro.email estão referenciando os atributos nome e email do objeto outro, 
	 que é uma instância da classe Usuario. No exemplo, outro é o objeto u2.
	 
	 this.nome e this.email estão referenciando os atributos nome e email do objeto atual, 
	 ou seja, o objeto no qual o método equals está sendo chamado, que é o objeto u1.
	 */
}
