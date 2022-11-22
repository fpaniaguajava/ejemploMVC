package com.fernandopaniagua.mvc.controlador;

import com.fernandopaniagua.mvc.modelo.Cliente;
import com.fernandopaniagua.mvc.modelo.GestorClientes;

public class ClienteController {
	public static void agregarCliente(String nombre, int saldo) throws Exception{
		GestorClientes gc = new GestorClientes();
		try {
			Cliente nc = new Cliente(nombre, saldo);
			gc.comprobarDatos(nc);
			gc.agregarCliente(nc);
		} catch (Exception e) {
			throw e;
		}
	}
}