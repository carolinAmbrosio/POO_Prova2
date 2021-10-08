package com.edu.ufam.questão2;

import java.util.Scanner;

public class Eleitoral {
	
	Scanner sc = new Scanner(System.in);

	private String nome = "";
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void showDataEleitoral() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}
	
	public void imprimir() {
		System.out.println("Nome: ");
		setNome(sc.nextLine());
		System.out.println("Idade: ");
		setIdade(Integer.parseInt(sc.nextLine()));
	}
	 public void verificar() {
		 if( idade < 16) {
			 System.out.println("Eleitor não pode votar");
		 }else if(idade >= 16 && idade <= 65) {
			 System.out.println("Eleitor deve votar");
		 }else if(idade > 65) {
			 System.out.println("Voto facultativo");
		 }
	 }
	
}
