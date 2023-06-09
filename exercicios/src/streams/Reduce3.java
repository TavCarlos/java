package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) ->  media.adicionar(nota); //media -> acumulador, double -> elem.
		/*
		como eu fiz na função adicionar para que retornace a própria média, consigo resolver isso em uma linha.
		  Caso retornasse void seria necessário: {
		  	media.adicionar(nota);
		  	return media;
		 	};
		 */
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2); //onde o valor da m2
		
		
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		/*
		 New Media() É a instância da Classe media e representa o valor inicial/acumulador do reduce.
		 Assim, tanto 'calcularMedia' e 'combinarMedia' recebem como parâmetro o 'new Media()'
		 Com isso, 'media' na função 'calcularMedia' e 'm1' na função calcularMedia recebem 'new Media()';
		 Essa instância serve para que mantenha acumulado tanto o valor total quanto a quantidade de notas;
		 
		 calcularMedia é aplicado a cada elemento do fluxo (alunosAprovados) juntamente com o acumulador(Instância de Media)
		 Logo, o acumulador tem quanto o somatório das notas quanto a quantidade de notas.
		 */
		
		System.out.println("A media dos Aprovados da Turma é: " + media.getValor());
	}
}
