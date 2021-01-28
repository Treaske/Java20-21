package ejercicioPOO;

public class Cilindro {
	private double radio;
	private double altura;

	public Cilindro(double radio, double altura){
			this.radio=radio;
			this.altura=altura;
	}
	
	public double VolumCil(double radio, double altura){
		double volumenCil;
		volumenCil=Math.PI*radio*altura;
		
		return volumenCil;
	}
	public double AreaCil(double radio){
		double areaCil;
		areaCil = Math.PI*Math.pow(radio, 2);
		
		return areaCil;
	}
}
