package ejercicioPOO;

	import java.util.Scanner;               //importamos el scanner y el joption pane

	import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Circulo ejem1=new Circulo(0);                           //declaramos las clases de las tres formas para poder llamarlas en el menu y acceder a ellas
		Rectangulo ejem2=new Rectangulo(0, 0);
		Cilindro ejem3=new Cilindro(0, 0);

		Object [] eleccion ={"Circulo","Cilindro","Rectangulo","Salir"};   //creamos el menu 
		Object opcion2 = ""; 
		
		while (opcion2 != "Salir") {       //Hasta que no se seleccione la opcion salir no se acaba el programa
			Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opción", "Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccion, eleccion[0]);
			opcion2 = opcion;        // este joptionpane nos permite seleccionar con que forma queremos trabajar
			
			if (opcion == "Circulo") {
				
				Object [] eleccionCir ={"Perimetro","Area","Volver"};      // creamos el mismo joptionpane para elegir la accion a realizar en la forma
				Object opcion2Cir = ""; 
				
				while (opcion2Cir != "Volver") {      // funciona igual que el menu general, hasta que no se selaccione "volver" no acabaria el bucle
					Object opcionCir = JOptionPane.showInputDialog(null,"Selecciona una opción", "Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccionCir, eleccionCir[0]);
					opcion2Cir = opcionCir;
					double radio;            //elegimos la opcion que queremos
					
					if (opcionCir == "Perimetro") {
						System.out.println("Escriba el radio del circulo");       // pedimos los datos mediante el metodo scanner
						 radio = scan.nextInt();
						System.out.println("El perimetro de su circulo es: " + ejem1.PerimCir(radio));   // y llamamos al metodo de la clase de la forma elegida con el dato que nos proporciona el usuario
						}
					else if (opcionCir == "Area") {
						System.out.println("Escriba el radio del circulo");       //repetimos el proceso anterior
						 radio = scan.nextInt();
						System.out.println("El area de su circulo es: " + ejem1.AreaCir(radio));
				}
					else {
						opcion2Cir="Volver";    //volveria al menu general 
					}
					
				}
			}                                             //las siguientes opciones serian exactamente igual que el circulo pero llamando a la forma correspondiente y al metodo que se quiera realizar
			
			else if (opcion == "Cilindro") {
				Object [] eleccionCil ={"Volumen","Area","Volver"}; 
				Object opcion2Cil = ""; 
				
				while (opcion2Cil != "Volver") {
					Object opcionCil = JOptionPane.showInputDialog(null,"Selecciona una opción", "Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccionCil, eleccionCil[0]);
					opcion2Cil = opcionCil;
					double radio;
					double altura;
					
					if (opcionCil == "Volumen") {
						System.out.println("Escriba el radio del cilindro");
						 radio = scan.nextInt();
						System.out.println("Escriba la altura del cilindro");
						 altura = scan.nextInt();
						 System.out.println("El volumen de su cilindro es: " + ejem3.VolumCil(radio, altura));
				}
					else if (opcionCil == "Area") {
						System.out.println("Escriba el radio del cilindro");
						 radio = scan.nextInt();
						System.out.println("Escriba la altura del cilindro");
						 altura = scan.nextInt();
						 System.out.println("El area de su cilindro es: " + ejem3.AreaCil(radio));
				}
					else {
						opcion2Cil="Volver";   //acabamos el programa
					}
					
				}
			}
			else if (opcion == "Rectangulo") {
			
					Object [] eleccionRec ={"Perimetro","Area","Volver"}; 
					Object opcion2Rec = ""; 
					
					while (opcion2Rec != "Volver") {
						Object opcionRec = JOptionPane.showInputDialog(null,"Selecciona una opción", "Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccionRec, eleccionRec[0]);
						opcion2Rec = opcionRec;
						double base;
						double altura;
						
						if (opcionRec == "Perimetro") {
							System.out.println("Escriba la base del rectangulo");
							 base = scan.nextInt();
							System.out.println("Escriba la altura del rectangulo");
							 altura = scan.nextInt();
							System.out.println("El perimetro de su rectangulo es: " + ejem2.PerimRec(base, altura));
						}
						else if (opcionRec == "Area") {
							System.out.println("Escriba la base del rectangulo");
							 base = scan.nextInt();
							System.out.println("Escriba la altura del rectangulo");
							 altura = scan.nextInt();
							System.out.println("El area de su rectangulo es: " + ejem2.AreaRec(base, altura));
					}
						else {
							opcion2Rec="Volver";
						}
						
					}
			}
			else {
				System.out.println("Fin del programa.");
			}
			
		}
	}

}