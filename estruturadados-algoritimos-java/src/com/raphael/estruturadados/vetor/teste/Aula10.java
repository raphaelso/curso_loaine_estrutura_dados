package com.raphael.estruturadados.vetor.teste;

import com.raphael.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
/*		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		
		System.out.println("Tamanho = " + vetor.getTamanho());
		
		System.out.println(vetor);*/
		
		Contato c1 = new Contato("Contato 1", "1234-1234", "contato1@contato.com.br");
		Contato c2 = new Contato("Contato 2", "2222-1234", "contato2@contato.com.br");
		Contato c3 = new Contato("Contato 3", "7777-1234", "contato3@contato.com.br");
		Contato c4 = new Contato("Contato 3", "7777-1234", "contato3@contato.com.br");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.getTamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor --> " + pos );
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
