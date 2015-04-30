public class Paciente {

	private String nombre;
	private int edad;
	
	public Paciente() {
		edad=20;
		nombre="pepe";
	}
	
	public boolean equals(Paciente p) {
		return this.nombre==p.nombre;
	}
}
