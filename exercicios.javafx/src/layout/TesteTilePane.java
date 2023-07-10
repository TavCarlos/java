package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{

	public TesteTilePane() {

		List<Quadrado> quadrados = new ArrayList<>();
		
		for(int i = 1; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setVgap(10);
		setHgap(10);
		
		setTileAlignment(Pos.CENTER);
		getChildren().addAll(quadrados);
	}
	
	/*
	 * TilePane é um layout de contêiner que organiza seus filhos em uma grade flexível, 
	 * onde cada filho é exibido em uma célula. Essas células têm um tamanho fixo e são alinhadas 
	 * horizontalmente e verticalmente para preencher o espaço disponível no TilePane.
	 * 
	 * O TilePane pode ser útil quando você deseja exibir um conjunto de nós de tamanho uniforme, 
	 * como botões, em uma grade, com um número específico de colunas ou linhas. Ele se ajusta automaticamente ao 
	 * redimensionamento da janela ou ao adicionar ou remover nós, reorganizando-os conforme necessário.
	 * 
	 * 
	 * */
}
