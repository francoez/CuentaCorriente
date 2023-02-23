package com.cursoceat.controller;

public class Gestor {
	String dni;
	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	public void Gestor(String nombre,String dni) {
		this.nombreGestor=nombre;
		this.dni=dni;
	}
	
	public void Gestor(String nombre) {
		this.nombreGestor=nombre;
		this.telefono=telefono;
		this.importeMax=1000;
	}
	
	public void Gestor(String nombre,String telefono, double importe) {
		this.nombreGestor=nombre;
		this.telefono=telefono;
		this.importeMax=importe;
	}


	public String getTelefono() {
		return telefono;
	}

	
	void mostrarInfoGestor() {
		System.out.println("Nombre ->"+this.nombreGestor+"\nTelefono->"
	+this.telefono+"\nImporte maximo->"+this.importeMax+" €");
	}
	
	
	
	
	
}
