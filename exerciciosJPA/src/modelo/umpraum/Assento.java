package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assento {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String nome;
		
		/*
		 * Para criar uma relação bidirecional entre Assento-Cliente é preciso
		 * criar aqui um atributo Cliente cliente juntamente com a anotation:
		 * @OneToOne(mappedBy = 'assento') -> relação um para um está mapeada dentro do atributo assento na classe 'Cliente'
		 * 
		 * Se não tiver o mappedBy ele criará um novo atributo chamado cleinte na tabela
		 * o que pode ocorrer inconsistencias de dados.
		 * */
		
		public Assento() {
		
		}
		
		public Assento(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
}
