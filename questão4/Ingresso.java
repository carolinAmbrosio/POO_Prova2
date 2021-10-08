package com.edu.ufam.questão4;

import java.util.Scanner;

public class Ingresso {
	Scanner sc = new Scanner(System.in);
	
	private float valor;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void recebeValor(float valor) {
		System.out.println("Valor: R$ ");
		setValor(Float.parseFloat(sc.nextLine()));
	}
	
	public void imprimir(float valor) {
	   	System.out.println("Ingresson custa: R$ "+this.valor);
    }

}
