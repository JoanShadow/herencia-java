package com.joan.herencia.animales;

import com.joan.herencia.interfaces.Comestible;

public class Animal {
		
		private String nickName;
		private String name;
		private int patas;
		private boolean vuela;
		private float peso;
		private String especie;
		
	public Animal(String nickName, String name, int patas, boolean vuela, float peso, String especie) {
		this.nickName = nickName;
		this.name = name;
		this.patas = patas;
		this.vuela = vuela;
		this.peso = peso;
		this.especie = especie;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
