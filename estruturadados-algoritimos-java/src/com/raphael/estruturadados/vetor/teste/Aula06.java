package com.raphael.estruturadados.vetor.teste;

import com.raphael.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento 1");// 0
		vetor.adiciona("Elemento 2");// 1
		vetor.adiciona("Elemento 3");// 2
		
		System.out.println( vetor.busca("elemento 1") );
		System.out.println( vetor.busca("elemento 2") );
		System.out.println( vetor.busca("elementos 3") );

	}

}
