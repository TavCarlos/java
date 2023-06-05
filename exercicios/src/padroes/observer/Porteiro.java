package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 *representa o subject -> trecho de código que tem condições de detectar um determinado evento
 *e quando detecta notifica todos os observadores. 
 */
public class Porteiro { 

	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();
	
	public void registrarObservadores(ChegadaAniversarianteObservador observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.print("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)){
				//criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				//notificando os observadores
				observadores.stream().forEach(o -> o.Chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}
		entrada.close();
	}
}
