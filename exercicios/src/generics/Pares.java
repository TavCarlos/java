package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); //linkedHashSet -> garante ordenação pela ordem de inclusão.
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; //return em método void -> ele irá sair do método caso chave for igual a null;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) { //verifica se em itens já existe elemento com a mesma chave e valor.
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();

		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
		
	}
	
	
	
}
