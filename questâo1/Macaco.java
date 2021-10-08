package com.edu.ufam.questâo1;

import java.util.Scanner;

public class Macaco {
	
	Scanner sc = new Scanner(System.in);
	
	private String nome = "";
	private String bucho = "";
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBucho() {
		return bucho;
	}
	
	public void setBucho(String bucho) {
		this.bucho = bucho;
	}

	public void showDataMacaco() {
		System.out.println("Nome: " + getNome());
	}
	
	public void verMacaco() {
		System.out.println("Nome: ");
		setNome(sc.nextLine());
	}
	
	public void comer(){
		System.out.println("O macaco vai comer: ");
		setBucho(sc.nextLine());
	}
	
	public void digerir(){
		System.out.println("");
		setBucho(sc.nextLine());
	}
}
