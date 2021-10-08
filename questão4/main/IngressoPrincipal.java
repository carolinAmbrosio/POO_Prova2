package com.edu.ufam.questão4.main;

import java.util.Scanner;

import com.edu.ufam.questão4.Ingresso;
import com.edu.ufam.questão4.IngressoVip;

public class IngressoPrincipal {

	@SuppressWarnings("unused")
	private static Scanner sc;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		
		Ingresso ig = new Ingresso();
		IngressoVip igv = new IngressoVip();
		
		ig.recebeValor(ig.getValor());
		ig.imprimir(ig.getValor());
		
		igv.recebeAdd();
		igv.imprimir(igv.acrescimo(igv.getValor()));
		
	}

}
