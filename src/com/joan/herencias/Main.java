package com.joan.herencias;

import com.joan.herencia.animales.Gallina;
import com.joan.herencia.animales.Gato;

public class Main {

	public static void main(String[] args) {
		Gato michi = new Gato("Michi7", "Michifu", 4, false, 3, "Siames", 7, null, 6);
		Gallina cocode = new Gallina("Plumitas", "Plumas", 0, false, 0, "Parda");
		
		michi.eat(cocode);
	}

}
