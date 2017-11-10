package com.joan.herencia.animales;

import java.util.List;

import com.joan.herencia.common.Vacuna;
import com.joan.herencia.interfaces.Comestible;

public class Gato extends Animal implements Comestible {
	
	private float largoBigotes;
	private int numVidas;
	private List<Vacuna> vacunas;
	
	public Gato(String nickName, String name, int patas, boolean vuela, float peso, String especie, int numVidas, List<Vacuna> vacunas, float largosBigotes) {
		super(nickName, name, patas, vuela, largosBigotes, especie);
		this.numVidas = numVidas;
		this.vacunas = vacunas;
		this.largoBigotes = largosBigotes;
		
	}

	public float getLargoBigotes() {
		return largoBigotes;
	}

	public void setLargoBigotes(float largoBigotes) {
		this.largoBigotes = largoBigotes;
	}

	public int getNumVidas() {
		return numVidas;
	}

	public void setNumVidas(int numVidas) {
		this.numVidas = numVidas;
	}

	public List<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(List<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	@Override
	public void sayIsCooked() {
		
	}
}


