package ar.edu.unlam.pb2;

public class YateAVela extends Yate{

	private Double altura;
	private Double superficieVelicaMayor;
	private Double superficieTotal;
	
	public YateAVela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double altura, Double superficieVelicaMayor, Double superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.altura = altura;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public void setSuperficieVelicaMayor(Double superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public Double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	@Override
	public Double calcularPrecioAmarre() {
		Double precio = 9000.0;
		if (getEslora() > 20) {
			return precio + 3000.0;
		} else {
			return precio + 2000.0;
		}
	}
	
}
