package com.example.injecaoDependencia.services;

import org.springframework.stereotype.Service;

@Service
public class TaxServices {

	public double tax(double value) {
		return value * 0.1;
	}
}

/*
*DENTRO DE UMA APLICAÇÃO GRANDE, ESSA INSTÂNCIAÇÃO DAS CLASSES É TRABALHOSA.
*COM ISSO, HÁ VÁRIOS FRAMEWORKS, COMO SPRING, QUE POSSUEM MECANISMOS DE
*GERANCIAR AS DEPENDÊNCIAS.
*
* PASSOS A FAZER:
* 1 -> REGISTRAR OS COMPONENTES.
* @Component -> REGISTRA A CLASSE COMO UM COMPONENTE QUE SERÁ GERENCIADO PELO FRAMEWORK
* @Service -> FAZ A MESMA COISA QUE O '@Component'.
* 
* 
* 2 -> INDICAR QUAL COMPONENTE DEPENDE DE QUAL.
*/