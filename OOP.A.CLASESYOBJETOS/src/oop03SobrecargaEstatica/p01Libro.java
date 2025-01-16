package oop03SobrecargaEstatica;

public class p01Libro {

	public static void main(String[] args) {


	Libro l = new Libro ();
	l.setTitulo("Dune");
	l.setPaginas(300);
	
	System.out.println(l.getPaginaActual());
	l.avanzarpagina();
	System.out.println(l.getPaginaActual());
	l.avanzarpagina();
	System.out.println(l.getPaginaActual());
	//l.avanzarpagina(35);
	//Al declarar el metodo avanzarpagina() como private ya no se puede usar en el principal
	//Aunque el programa lo use internamente para avanzar capitulo y para avanzar pagina.
	//Al introducir l. ya no sale la opcion de avanzarpagina()
	l.avanzarcapitulo();
	System.out.println(l.getPaginaActual());
	

	}

}
