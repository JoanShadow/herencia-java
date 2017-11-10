package com.joan.herencia.animales;

import com.joan.herencia.interfaces.Comestible;

public class Gallina extends Animal implements Comestible {

	public Gallina(int patas, boolean vuela, float peso, String especie) {
		super(patas, vuela, peso, especie);
			
	}

	@Override
	public void sayIsCooked() {
		
	}
	
	public String toString() {
		return "" + this.getEspecie();
	}
}
