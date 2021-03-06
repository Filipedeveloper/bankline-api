package com.dio.satander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Conta {
	
	@Column(name = "conta_numero")
	private Long numero;
	
	@Column(name = "conta_saldo")
	private double saldo;
	
	
	
	
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
