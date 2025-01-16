package oop04Relacion1aN.ARRAYLIST;

import java.util.ArrayList;

public class p01ArrayList {

	public static void main(String[] args) {

		ArrayList<String> milista = new ArrayList<>();
		milista.add("Hola ");
		milista.add("¿Qué ");
		milista.add("tal ");
		milista.add("estás? ");

		for (String i : milista) {
			System.out.print(i);
		}
		boolean contiene = milista.contains("Hola ");
		boolean contiene1 = milista.contains("SOS");
		System.out.println(contiene);
		System.out.println(contiene1);
		
		// milista.clear(); Esto vaciaria el Arraylist
		//milista.remove(2);
		//milista.remove("tal ");  Eliminar un elemento por posicion o por nombre

	}

}
