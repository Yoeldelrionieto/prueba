package com.interfaces;

public abstract class Animal {
	public String nombre;
	public String raza;
	public double peso;
	public String color;
	
	
	 public Animal(String nombre, String raza, double peso, String color) {
	        this.nombre = nombre;
	        this.raza = raza;
	        this.peso = peso;
	        this.color = color;
	    }
	/*public abstract Boolean vacunar();
	public abstract Boolean comer();
	public abstract Boolean dormir();
	public abstract String hacerRuido();*/
	public abstract String hacerCaso();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	 
	 
	

}

	
