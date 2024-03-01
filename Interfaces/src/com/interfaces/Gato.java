package com.interfaces;

public class Gato extends Animal implements IAnimal{
	

	public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }
	

	@Override
	public Boolean vacunar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean comer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean dormir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "Miau";
	}

	@Override
	public String hacerCaso() {
		// TODO Auto-generated method stub
		return "a veces no hacen caso";
	}
	public String toserBolaPelo() {
		return "Tose una bola de Pelo";
		
	}

	@Override
	public String toString() {
		return "[Gato] \n nombre: " + nombre + ",\n raza: " + raza + ",\n peso: " + peso + ",\n color: " + color + ",\nEl gato ha sido vacunado: "
				+ vacunar() + ",\n ha comido: " + comer() + ",\n ha dormido: " + dormir() + ",\n hace de ruido: " + hacerRuido()
				+ ",\n para hacer caso: " + hacerCaso() + ",\n y su hooby es: " + toserBolaPelo();
	}
	
	

}
