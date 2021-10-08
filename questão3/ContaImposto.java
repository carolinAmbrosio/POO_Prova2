package com.edu.ufam.questão3;

import java.util.Scanner;

public class ContaImposto extends ContaBancária{
	
	Scanner sc = new Scanner(System.in);
	private double percentualImposto; 

	public ContaImposto(String numero, String agencia, double saldo, int codigoTipo) {
		super(numero, agencia, saldo, codigoTipo);
	}
	
	public double getPercentualImposto() {
		return percentualImposto;
	}

	public void setPercentualImposto(double percentualImposto) {
		this.percentualImposto = percentualImposto;
	}

	public double calcularImposto() {
		setSaldo(getSaldo() - (getSaldo() * 0.10));
		return getSaldo();
	}

	public void showDataContaImposto() {
		System.out.println("Numero: " + getNumero() + "\nAgencia: " + getAgencia() +
				"\nSaldo: " + getSaldo() + "Codigo Tipo: " + getCodigoTipo());
	}
	
	public void lerContaImposto() {
		System.out.println("Numero: ");
		setNumero(sc.nextLine());
		System.out.println("Agencia: ");
		setAgencia(sc.nextLine());
		System.out.println("Saldo: ");
		setSaldo(Double.parseDouble(sc.nextLine()));
		System.out.println("Codigo Tipo: ");
		setCodigo_tipo(Integer.parseInt(sc.nextLine()));
	}

	
}
