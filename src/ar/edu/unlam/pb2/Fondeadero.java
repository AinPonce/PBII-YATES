package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Fondeadero {

	private String nombre;
	private Integer cantidadMaximaDeAmarras;
	private HashSet<Yate> yates;

	public Fondeadero(String nombre, Integer cantidadMaximaDeAmarras) {
		super();
		this.nombre = nombre;
		this.cantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
		this.yates = new HashSet<Yate>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadMaximaDeAmarras() {
		return cantidadMaximaDeAmarras;
	}

	public void setCantidadMaximaDeAmarras(Integer cantidadMaximaDeAmarras) {
		this.cantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
	}
	
	public HashSet<Yate> getYates() {
		return yates;
	}

	public void setYates(HashSet<Yate> yates) {
		this.yates = yates;
	}

	public void amarrarYate(Yate yate) throws NoHayLugarParaAmarrarException {

		if (cantidadMaximaDeAmarras>0) {
			yates.add(yate);
			cantidadMaximaDeAmarras--;
		} else {
			throw new NoHayLugarParaAmarrarException();
		}
	}
	
	public Integer getCantidadDeYates() {
		return yates.size();
	}

	public void desamarrarYate(Yate yate) {
		yates.remove(yate);
		cantidadMaximaDeAmarras++;
	}

	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return cantidadMaximaDeAmarras;		
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		return ((Yate) yate).calcularPrecioAmarre();
	}

	public Double obtenerRecaudacionTotal() {
		Double recaudacion = 0.0;
		
		for (Yate yate : yates) {
			recaudacion += yate.calcularPrecioAmarre();
		}
		return recaudacion;
	}
}
