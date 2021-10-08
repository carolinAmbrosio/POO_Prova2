package com.edu.ufam.questão2.main;

import java.util.Scanner;

import com.edu.ufam.questão2.Eleitoral;

public class EleitoralTeste {
	
	@SuppressWarnings("unused")
	private static Scanner sc;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Eleitoral el = new Eleitoral();
el.imprimir();
el.verificar();
		
	}

}
