package oop02ThrowExceptions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	static void miMetodo() throws Exception {
		// Aqui vemos como se añade la excepcion en el metodo.
		try {

			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha = df.parse("31/02/2025");
			System.out.println(mifecha);
			File f = new File("F://hola.txt");
			f.createNewFile();

		} catch (IOException | ParseException e) {
			System.out.println("LOG a fichero; el metodo falla porque " + e.getMessage());
			e.printStackTrace();
			throw e;
			// Al escribir throw e; el chivato del IDE nos va a pedir que añadamos una
			// declaracion throw al metodo.
			// Relanzar una excepcion.En este caso esto seria util, imaginandonos que la
			// Clase servicio no es visible por el usuario y el programa principal es una
			// aplicacion web u otro tipo de programa que el usuario esta ejecutando.

		} finally {

			System.out.println("Cerrando recursos.");
		}
	}

}
