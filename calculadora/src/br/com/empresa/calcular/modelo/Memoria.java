package br.com.empresa.calcular.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, INVERTER, PORCENTAGEM, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRUGLA
	};
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	private static final Memoria instance = new Memoria();
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean substituir = false;
	private TipoComando ultimaOperacao = null;
	
	
	
	private Memoria() { //com construtor private eu somente tenho uma instância
		
	}

	public static Memoria getInstance() {
		return instance;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public void processarNotificarObservadores(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);
		
		if(tipoComando == TipoComando.ZERAR || tipoComando == null) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		} else if(tipoComando == TipoComando.INVERTER) {
			if(textoAtual.contains("-")) {
				textoAtual = textoAtual.replace("-", "");
			} else {
				textoAtual = "-" + textoAtual;
			}
		} else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRUGLA) {
			if(textoAtual.isEmpty() && ",".equals(texto)) {
				textoAtual = "0" + texto;
			} else {
				textoAtual = substituir ? texto : textoAtual + texto;
				substituir = false;
			}
		} else if(tipoComando == TipoComando.PORCENTAGEM) {
			double numeroAtualP = Double.parseDouble(textoAtual);
			double numeroBufferP = Double.parseDouble(textoBuffer);
			
			double resultadoPorcentagem = (numeroAtualP/100)*numeroBufferP;
			String resultadoPString = Double.toString(resultadoPorcentagem);
			textoAtual = textoBuffer.isEmpty() ? "0" : resultadoPString;
					
		} else {
			substituir = true;
			textoAtual = obterResuldadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		observadores.forEach(observador -> observador.valorAlterado(Memoria.getInstance().getTextoAtual()));
	}

	
	
	private String obterResuldadoOperacao() {
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(textoBuffer.replaceAll(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replaceAll(",", "."));
		
		double resultado = 0;
		
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		} else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		} else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		} else if (ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}
		
		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
	}

	private TipoComando detectarTipoComando(String texto) {
		
		if(texto.isEmpty() && "0".equals(texto)) {
			return null;
		}
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch(NumberFormatException e){
			if("AC".equals(texto)) {
				return TipoComando.ZERAR;
			} else if("+/-".equals(texto)) {
				return TipoComando.INVERTER;
			} else if("%".equals(texto) && !textoBuffer.isEmpty()) {
				return TipoComando.PORCENTAGEM;
			} else if("%".equals(texto) && textoBuffer.isEmpty()) {
				return null;
			} else if("/".equals(texto)) {
				return TipoComando.DIV;
			} else if("*".equals(texto)) {
				return TipoComando.MULT;
			} else if("-".equals(texto)) {
				return TipoComando.SUB;
			} else if("+".equals(texto)) {
				return TipoComando.SOMA;
			} else if("=".equals(texto)) {
				return TipoComando.IGUAL;
			} else if(",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRUGLA;
			}
		}
		return null;
	}
	
}
