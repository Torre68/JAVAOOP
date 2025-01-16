package oop06RelacionesRecursivas;

public class oop06RelacionesRecursivas {

	public static void main(String[] args) {
		
		Persona manolo = new Persona ("Manolo");
		Persona maria = new Persona ("Maria");
		Persona pepe = new Persona ("Pepe");
		Persona eva = new Persona ("Eva");
		Persona luis = new Persona ("Luis");
		Persona laura = new Persona ("Laura");
		
		manolo.addAmigo(laura);
		manolo.addAmigo(luis);
		manolo.addAmigo(eva);
		manolo.addAmigo(pepe);
		manolo.addAmigo(maria);
		
		System.out.println(manolo.getAmigos().size());
		for (Persona p: manolo.getAmigos()) {
			System.out.println(p.getNombre());
		}



	}

}
