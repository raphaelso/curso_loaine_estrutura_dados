package com.raphael.estruturadados.vetor.teste;

import com.raphael.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);

		//Testando com retornos true ou false para não estourar tamanho do vetor
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		// retornando uma exception caso tamanho do vetor tenha sido atingido
/*		try {
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
			vetor.adiciona("Elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}
*/		
	}

}
