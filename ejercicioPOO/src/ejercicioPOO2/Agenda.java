package ejercicioPOO2;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Persona ejem1=new Persona(null, null, 0);
		
		Scanner scan = new Scanner(System.in);
			
		Persona grupo[]=new Persona[3];
			String nombre;
			String apellido;
			int telefono;
			int i;
		
		System.out.println("Escriba el nombre, apellidos y telefono de las personas que quiera añadir a la agenda");
			
		for (i=1;i<=3;i++) {
		System.out.println("Nombre "+i);
			String nom = scan.nextLine();
		System.out.println("Apellido "+i);
			String apel = scan.nextLine();
		System.out.println("Telefono "+i);
			int tlf = scan.nextInt();
			grupo [i]= new Persona(nom,apel,tlf);
			
		}	
	}

}
