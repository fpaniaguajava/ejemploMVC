package com.fernandopaniagua.mvc.modelo;

import com.fernandopaniagua.mvc.persistencia.ClientePersistente;

public class GestorClientes {
	public void comprobarDatos(Cliente c) throws Exception {
		if (c.getNombre()==null) {
			throw new Exception("Cliente null");
		}
	}
	
	public void agregarCliente(Cliente c) {
		System.out.println("Agregando cliente " + c.getNombre());
		ClientePersistente.save(c);
		return;
	}
	public void getClientesMorosos() {
		return;
	}
}
