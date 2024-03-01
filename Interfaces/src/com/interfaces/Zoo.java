package com.interfaces;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal perro = new Perro("Kyra", "Labrador", 30.0, "negro");
		Animal gato = new Gato("Maullidos", "Persa", 12.2, "atigrado");
		Animal elefante = new Elefante("Apisonadora", "Indio", 1350.0, "gris rosado");
		
		elefante.setNombre("Psioni");
		elefante.setRaza("Africano");
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());
		System.out.println(elefante.toString());
	}

}
