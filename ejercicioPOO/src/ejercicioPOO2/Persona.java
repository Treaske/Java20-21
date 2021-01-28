package ejercicioPOO2;

public class Persona {
	private String nombre;
	private String apellidos;
	private int telefono;
	
	public Persona (String nombre, String apellidos, int telefono) {
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono  ;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	
	
	
	

}
