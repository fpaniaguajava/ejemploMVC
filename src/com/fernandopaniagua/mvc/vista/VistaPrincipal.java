package com.fernandopaniagua.mvc.vista;

import java.util.Scanner;

import com.fernandopaniagua.mvc.controlador.ClienteController;

public class VistaPrincipal {
	public void mostrarMenu() {
		System.out.println("1. Crear cliente");
		System.out.println("2. Mostrar clientes morosos");
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una opción:");
		int opcion = sc.nextInt();
		if (opcion==1) {
			System.out.print("Introduce el nombre:");
			String nombre = sc.next();
			System.out.print("Introduce el saldo:");
			int saldo = sc.nextInt();
			try {
				if (nombre.length()==1) nombre=null;
				ClienteController.agregarCliente(nombre, saldo);
				this.mostrarAcierto("El cliente se ha insertado correctamente");
			} catch (Exception e) {
				this.mostrarError(e.getMessage());
			}
		}
		sc.close();
	}
	public void mostrarError(String mensaje) {
		System.err.println(mensaje);
	}
	public void mostrarAcierto(String mensaje) {
		System.out.println(mensaje);
	}
}
