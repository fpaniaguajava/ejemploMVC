package com.fernandopaniagua.mvc.persistencia;

import com.fernandopaniagua.mvc.modelo.Cliente;

public class ClientePersistente {
	public static void save(Cliente c) {
		System.out.println("Guardando " + c.getNombre() + " en en ficheros");
	}
}
