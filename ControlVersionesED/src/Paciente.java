
public class Paciente {

	private String nombre;
	private int edad;
	
	public Paciente() {
		edad=20;
		nombre="pepe";
	}

	public int compareTo(Object o){
		Paciente p = (Paciente) o;
		
		if(nombre.compareTo(p.nombre) < 0) return -1;
		else if (nombre.compareTo(p.nombre) > 0) return 1;
		else if(edad < p.edad) return -1;
		else if(edad > p.edad) return 1;
		else return 0;
	}
	
	https://github.com/hik4ru/ED
	
}
