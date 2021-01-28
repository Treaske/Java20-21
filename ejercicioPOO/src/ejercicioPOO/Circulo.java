package ejercicioPOO;

public class Circulo {
	private double radio;

	public Circulo(double radio){
			this.radio=radio;
	}
	
	public double PerimCir(double radio){
		double perimetroCir;
		perimetroCir=2*Math.PI*radio;
		
		return perimetroCir;
	}
	public double AreaCir(double radio){
		double areaCir;
		areaCir=Math.PI*Math.pow(radio, 2);
		
		return areaCir;
	}
}
