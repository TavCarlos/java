module app.financeiro {
	
	requires app.calculo; //Diz que o modulo app.financeiro precisa utilizar o modulo app.calculo.
}
//Um módulo agrupa um conjunto de pacotes

/* Criar dependência entre Javas projects
* 
* 1° método
	 	Exportar o 'appCalculo' para dentro de 'appFinanceiro' e criar uma path.
	 	Assim, cria dependencia do 'appFinanceiro' com o 'appCalculo'. Podendo no 'appFinanceiro' utilizar
	 	os métodos definidos em 'appCalculo' caso estiverem visíveis fora do java project.
	  
	  2° método
	  biuld path -> configure biuld path -> projects -> module paths
*/

/*
* Quando há uma modulo-info.java todos os pacotes dentro do respectivo java project
* ficarão encapsulados, sendo assim, não será possível utilizar os métodos do appCalculo
* dentro do appFinanceiro.
* 
* Para que um pacote do 'appCalculo' ficar visível para o 'appFinanceiro'
* é necessário deixar explícito.
* */