package com.edu.ufam.questão4;

import java.util.Scanner;

public class IngressoVip extends Ingresso{

	Scanner sc = new Scanner(System.in);
	private float add;

	public float getAdd() {
		return add;
	}

	public void setAdd(float add) {
		this.add = add;
	}
	
	public void recebeAdd() {
		System.out.println("Acrescimo: R$ ");
		setAdd(Float.parseFloat(sc.nextLine()));
	}
	
	public float acrescimo(float valor) {
		valor = getValor()+ getAdd();
		return valor;
	}

}
