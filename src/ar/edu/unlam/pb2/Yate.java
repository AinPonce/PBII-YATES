package ar.edu.unlam.pb2;

public abstract class Yate {

	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Double peso;
	
	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso) {
		super();
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Double getManga() {
		return manga;
	}

	public void setManga(Double manga) {
		this.manga = manga;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public abstract Double calcularPrecioAmarre();
	
}
