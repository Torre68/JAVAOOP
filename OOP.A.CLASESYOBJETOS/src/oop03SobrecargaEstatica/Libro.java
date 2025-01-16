package oop03SobrecargaEstatica;

public class Libro {

	private String titulo;
	private int paginas;
	private int paginaActual;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	public void avanzarpagina() {

		//En vez de usar el incrementador paginaActual++;
		//podemos simplemente invocar el metodo avanzarpagina() y le pase como parametro un 
		// 1 (podriamos hacer un metodo retroceder pagina usando avanzapagina (-1)
		
		avanzarpagina(1);
		
	}

	// SOBRECARGA ESTATICA
	// La sobrecarga estática se refiere a la capacidad de una clase para
	// definir múltiples métodos con el mismo nombre, pero con diferentes
	// parámetros. Ambos avanzarpagina comparten el nombre pero reciben distintos parametros
	//y devuelven distintos resultados
	private void avanzarpagina(int paginas) {

		paginaActual = paginaActual + paginas;
	}
	
	public void avanzarcapitulo () {
		
		avanzarpagina(30);
	}
}
