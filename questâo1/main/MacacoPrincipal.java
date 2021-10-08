package com.edu.ufam.questâo1.main;

import java.util.Scanner;

import com.edu.ufam.questâo1.Macaco;

@SuppressWarnings("unused")
public class MacacoPrincipal {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Macaco mcc = new Macaco();
		Macaco mco = new Macaco();
		
		mcc.verMacaco();
		mcc.comer();
		
		System.out.println("\nNome Macaco 1: " + mcc.getNome());
		System.out.println("Macaco 1 comeu: " + mcc.getBucho());
		
		mcc.digerir();
		System.out.println("Macaco 1 digeriu todo a comida\n" + mcc.getBucho());
		
		mco.verMacaco();
		mcc.comer();
		
		System.out.println("\nNome Macaco 2: " + mco.getNome());
		System.out.println("Macaco 2 comeu: " + mcc.getBucho());
		
		mco.digerir();
		System.out.println("Macaco 1 digeriu todo a comida\n" + mco.getBucho());
		
		
	}

}
