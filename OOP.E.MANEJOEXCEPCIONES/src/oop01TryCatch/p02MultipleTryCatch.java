package oop01TryCatch;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p02MultipleTryCatch {

	public static void main(String[] args) {

		try {

			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha = df.parse("31/02/2025");
			System.out.println(mifecha);
			File f = new File("F://hola.txt");
			f.createNewFile();
			// Cuando nos da error, el chivato del error X nos da varias opciones con
			// respecto a las excepciones y como manejarlas. En este caso podemos escoger
			// entre crear una nueva clasula CATCH o añadir una excepcion nueva a la que ya
			// tenemos creada. Deberemos escoger la adecuada dependiendo de cada situacion
			// que nos encontremos, en eset caso es indiferente. Añadire las dos para que se
			// vean y comentare la nueva clausula CATCH dejando solo que funcione la
			// expcepcion añadida a la clausula CATCH que ya estaba presente. Fijarse que
			// las excepciones no son del mismo tipo:
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		// Cuando los TRY/CATCH detectan un problema que no permite continuar con la
		// ejecucion del programa, para el mismo y devuelven el mensaje de excepcion que
		// lo ha producido. Si tuviese lo de crear File arriba de la Fecha, el programa
		// no llegaria a darnos la notificacion del error en la fecha porque se para con
		// el error fatal del File. Si el error de la fecha fuese que pongo Date mifecha
		// = df.parse("31/02-2025"); el error seria critico y pararia el programa, pero
		// si lo dejo tal esta nos avisa y continua llegando al erro de File. No hay 31
		// dias en Febrero.

	}
}