package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true);

		getColumnConstraints().addAll(colCons(), colCons(), fixColCons(), colCons(), colCons()); //setar as colunas e suas contidade
		getRowConstraints().addAll(rowCons(), rowCons(), fixRowCons(), rowCons(),rowCons()); // setar as linhas e e suas quantidades
		
		setHgap(10);
		setVgap(10);
		
		//adicionando o elemento na tela
		add(c1, 0, 0, 2 , 2); //elemento, coluna, linha, colunas que ocupará, linhas que ocupará.
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3); //elemento, começará na coordenada(4,2), ocupará 1 coluna e 3 linhas.
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);
	}
	
	private ColumnConstraints colCons() {//cria colunas
		ColumnConstraints colCons = new ColumnConstraints();
		colCons.setPercentWidth(20); //Largura ocupará 20% da tela.
		colCons.setFillWidth(true);
		return colCons;
	}
	
	private ColumnConstraints fixColCons() { //cria colunas com largura fixa.
		ColumnConstraints fixColCons = new ColumnConstraints();
		fixColCons.setMinWidth(50);
		fixColCons.setMaxWidth(50);
		fixColCons.setFillWidth(true);
		return fixColCons;
	}
	
	private RowConstraints rowCons() {//cria linhas
		RowConstraints rowCons = new RowConstraints();
		rowCons.setPercentHeight(20); //Largura ocupará 20% da tela.
		rowCons.setFillHeight(true);
		return rowCons;
	}
	
	private RowConstraints fixRowCons(){ //cria linhas com altura fixa.
		RowConstraints fixRowCons = new RowConstraints();
		fixRowCons.setMinHeight(50);
		fixRowCons.setMaxHeight(50);
		fixRowCons.setFillHeight(true);
		return fixRowCons;
	}
	
	/*
	 * O gridPane te da maior flexibilização na hora de montar um layout pois ele irá dividir a tela em
	 * linhas e colunas, com isso você pode colocar o elemento em uma coordenada específica.
	 * */
}
