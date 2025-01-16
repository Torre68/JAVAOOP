package oop01TryCatch;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p03TryCatchFinally {

	public static void main(String[] args) {

		try {

			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date mifecha = df.parse("31/02/2025");
			System.out.println(mifecha);
			File f = new File("F://hola.txt");
			f.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// Un bloque finally se ejecutará siempre, independientemente de si se
			// lanzó una excepción o no. Esto es útil para liberar recursos, como cerrar
			// archivos o conexiones de base de datos.
			System.out.println("Cerrando recursos.");
		}

	}
}