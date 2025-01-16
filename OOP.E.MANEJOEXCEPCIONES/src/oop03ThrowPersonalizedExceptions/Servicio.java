package oop03ThrowPersonalizedExceptions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	static void miMetodo() throws Exception {

		try {

			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha = df.parse("31/02/2025");
			System.out.println(mifecha);
			File f = new File("F://hola.txt");
			f.createNewFile();

		} catch (IOException | ParseException e) {
			System.out.println("LOG a fichero; el metodo falla porque " + e.getMessage());
			e.printStackTrace();
			throw new ServicioException("Nuestro servicio ha fallado ",e);
			// Aqui creamos nuestra excepcion personalizada que nos sera util para devolver
			// una informacion mas precisa que la informacion generica que devuelve JAVA.

		} finally {

			System.out.println("Cerrando recursos.");
		}
	}

}
