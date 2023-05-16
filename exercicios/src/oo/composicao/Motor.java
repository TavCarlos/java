package oo.composicao;

public class Motor {

	Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1; //caso acrescente 1,5 vai jogar mais gasolina no motor e aumentará o giro.
	//por padrão quando gilado ele fica com faotrInjecao 1.
	
	//bidirecional
	//Motor(Carro carro){
	//	this.carro = carro;
	//}
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000); //arredonda o valor para o mais próximo. Se for 5.5 arredonda para 6
		}
	}
}
