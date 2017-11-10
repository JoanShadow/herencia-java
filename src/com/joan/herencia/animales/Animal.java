package com.joan.herencia.animales;

import com.joan.herencia.interfaces.Comestible;

public class Animal {
		
		private int patas;
		private boolean vuela;
		private float peso;
		private String especie;
		
	public Animal(int patas, boolean vuela, float peso, String especie) {
		this.patas = patas;
		this.vuela = vuela;
		this.peso = peso;
		this.especie = especie;
	}

	public void eat(Comestible elBocadito) {
		System.out.println("Estoy comiendo " + elBocadito.toString());
	}	
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean getVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
