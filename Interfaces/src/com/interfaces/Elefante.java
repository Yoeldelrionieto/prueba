package com.interfaces;

public class Elefante extends Animal implements IAnimal{

	
	public Elefante(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean vacunar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean comer() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean dormir() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "Brrrrrr";
	}

	@Override
	public String hacerCaso() {
		// TODO Auto-generated method stub
		return "Intentalo, maquina";
	}

	@Override
	public String toString() {
		return "[Elefante] \n nombre: " + nombre + ",\n raza: " + raza + ",\n peso: " + peso + ",\n color: " + color + ",\n ha sido vacunado: "
				+ vacunar() + ",\n ha comido: " + comer() + ",\n ha dormido:" + dormir() + ",\n hace el ruido: " + hacerRuido()
				+ ",\n y para hacer Caso:" + hacerCaso();
	}
	
	

}
