package com.edu.ufam.questão3.main;

import java.util.Scanner;

import com.edu.ufam.questão3.ContaBancária;
import com.edu.ufam.questão3.ContaImposto;

@SuppressWarnings("unused")
public class BancoMain {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		ContaBancária contB = new ContaImposto (null, null, 0, 1);
		ContaImposto contIm = new ContaImposto (null, null, 0, 2);
		
		contIm.lerContaImposto();
		
		System.out.println("\nNumero: " + contIm.getNumero());
		System.out.println("Agencia: " + contIm.getAgencia());
		contIm.validaTipo(0);
		contIm.mostrarSaldo();
		
		
		System.out.println("Apos o deposito: ");
		contIm.depositar(100);
		contIm.mostrarSaldo();
		System.out.println("Apos calcular imposto: ");
		contIm.calcularImposto();
		contIm.mostrarSaldo();
		System.out.println("Apos o saque: ");
		contIm.sacar(150);
		contIm.mostrarSaldo();
		
		System.out.println("========FIM========");
		
	}

}
