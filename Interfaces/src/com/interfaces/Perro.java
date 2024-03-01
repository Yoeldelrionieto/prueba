package com.interfaces;

public class Perro extends Animal implements IAnimal{

	
	public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

	@Override
	public String toString() {
		return "[Perro] \n nombre: " + nombre + ",\n raza: " + raza + ",\n peso: " + peso + ",\n color: " + color +"\nEl Perro hace el ruido: " + hacerRuido() + ",\n y para hacer caso: " + hacerCaso() + ",\n esta vacunado: " + vacunar()
			+ ",\n ha comido: " + comer() + ",\n ha dormido: " + dormir() + "\n y le han sacado de Paseo: " + sacarPaseo();
	}

	@Override
	public String hacerRuido() {
		// TODO Auto-generated method stub
		return "Woof";
	}

	@Override
	public String hacerCaso() {
		// TODO Auto-generated method stub
		return "suelen hacer caso";
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
	public String sacarPaseo() {
		return "a salido de paseo";
		
	}

}
