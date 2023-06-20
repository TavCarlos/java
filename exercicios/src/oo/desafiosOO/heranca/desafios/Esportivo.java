package oo.desafiosOO.heranca.desafios;

/*
 Interface -> Vai ter métodos e esses métodos não podem ter corpo.
 Ou seja, a interface define a necessidade de implementar algo quando uma classe herda de uma interface.
 Uma classe só pode herdar de uma única classe, entretanto, uma classe pode herdar de múltiplas interfaces.

 Todo método que está dentro de interface é public e é abstrato: que não possui corpo.
 */

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();
}
