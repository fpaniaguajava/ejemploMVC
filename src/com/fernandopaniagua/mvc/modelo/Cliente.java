package com.fernandopaniagua.mvc.modelo;

public class Cliente {
	String nombre;
	int saldo;
	public Cliente(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}	
}
