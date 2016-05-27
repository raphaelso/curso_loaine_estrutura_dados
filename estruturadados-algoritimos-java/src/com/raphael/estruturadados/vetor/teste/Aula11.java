package com.raphael.estruturadados.vetor.teste;

import com.raphael.estruturadados.vetor.Lista;
import com.raphael.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-1234", "contato1@contato.com.br");
		Contato c2 = new Contato("Contato 2", "2222-1234", "contato2@contato.com.br");
		Contato c3 = new Contato("Contato 3", "7777-1234", "contato3@contato.com.br");
		Contato c4 = new Contato("Contato 3", "7777-1234", "contato3@contato.com.br");
		
		vetor.adiciona(c1);
		
		System.out.println(vetor);
	}

}
