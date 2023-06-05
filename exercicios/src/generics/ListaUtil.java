package generics;

import java.util.List;

/*
 É possível criar generics somente no método, não sendo necessário cria-lo na classe.
 */


/*
 List<?> -> lista de qualquer tipo.
 Não posso colocar List<Object> pois irá querer uma lista especificamente de objetos.
 É possível fazer List<? extends Number>, assim, como parâmetro só irá aceitar lista de números.
 */
public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	
	
	//defino que a funlão tem um tipo genérico <T>, ela retornará esse tipo genérico, e a Lista tem esse mesmo tipo.
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
