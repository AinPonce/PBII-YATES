package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void queSePuedaCrerUnFondadeadero() {
		//Preparaci�n
		final String NOMBRE_ESPERADO = "El fondeadero de Tito";
		final Integer CANTIDAD_AMARRAS_ESPERADO = 70;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero(NOMBRE_ESPERADO, CANTIDAD_AMARRAS_ESPERADO);
		
		//Verificaci�n
		assertEquals(NOMBRE_ESPERADO, fondeadero.getNombre());
		assertEquals(CANTIDAD_AMARRAS_ESPERADO, fondeadero.getCantidadMaximaDeAmarras());
	}
	
	@Test
	public void queSePuedaCrearUnYateAMotor() {
		//Preparaci�n
		final String NOMBRE_ESPERADO = "AZ1";
		final String DUE�O_ESPERADO = "Andr�s Brogeat";
		final Double MANGA_ESPERADO = 18.87;
		final Double CALADO_ESPERADO = 5.17;
		final Double ESLORA_ESPERADO = 119.0;
		final Integer TRIPULACION_ESPERADO = 37;
		final Double PESO_ESPERADO = 5500.0;
		final Double DESPLAZAMIENTO_ESPERADO = 5959.0;
		final String PROPULSION_ESPERADO = "2 x motores di�sel MAN RK2805";
		final Double POTENCIA_ESPERADO = 9000.0;
		final Double VELOCIDAD_ESPERADO = 23.0;
		final Double AUTONOMIA_ESPERADO = 6500.0;
		
		//Ejecuci�n
		Yate nuevo = new YateMotor(NOMBRE_ESPERADO, DUE�O_ESPERADO, MANGA_ESPERADO,
				CALADO_ESPERADO, ESLORA_ESPERADO, TRIPULACION_ESPERADO, PESO_ESPERADO, DESPLAZAMIENTO_ESPERADO,
				PROPULSION_ESPERADO, POTENCIA_ESPERADO, VELOCIDAD_ESPERADO, AUTONOMIA_ESPERADO);
		//Verificaci�n
		assertEquals(NOMBRE_ESPERADO, nuevo.getNombre());
		assertEquals(DUE�O_ESPERADO, nuevo.getDuenio());
		assertEquals(MANGA_ESPERADO, nuevo.getManga());
		assertEquals(CALADO_ESPERADO, nuevo.getCalado());
		assertEquals(ESLORA_ESPERADO, nuevo.getEslora());
		assertEquals(TRIPULACION_ESPERADO, nuevo.getTripulacion());
		assertEquals(PESO_ESPERADO, nuevo.getPeso());
		assertEquals(DESPLAZAMIENTO_ESPERADO, ((YateMotor) nuevo).getDesplazamiento());
		assertEquals(PROPULSION_ESPERADO, ((YateMotor) nuevo).getPropulsion());
		assertEquals(POTENCIA_ESPERADO, ((YateMotor) nuevo).getPotencia());
		assertEquals(VELOCIDAD_ESPERADO, ((YateMotor) nuevo).getVelocidad());
		assertEquals(AUTONOMIA_ESPERADO, ((YateMotor) nuevo).getAutonomia());
	}
	
	@Test
	public void queSePuedaCrearUnYateDeVela() {
		//Preparaci�n
				final String NOMBRE_ESPERADO = "XXR";
				final String DUE�O_ESPERADO = "Sebastian Pardo";
				final Double MANGA_ESPERADO = 6.90;
				final Double CALADO_ESPERADO = 2.7;
				final Double ESLORA_ESPERADO = 13.45;
				final Integer TRIPULACION_ESPERADO = 5;
				final Double PESO_ESPERADO = 1400.0;
				final Double ALTURA_ESPERADO = 21.5;
				final Double SUPERFICIE_VELICA_MAYOR_ESPERADA = 85.0;
				final Double SUPERFICIE_TOTAL_ESPERADO = 133.0;
		
		//Ejecuci�n
		Yate nuevo = new YateAVela(NOMBRE_ESPERADO, DUE�O_ESPERADO, MANGA_ESPERADO,
				CALADO_ESPERADO, ESLORA_ESPERADO, TRIPULACION_ESPERADO, PESO_ESPERADO, ALTURA_ESPERADO,
				SUPERFICIE_VELICA_MAYOR_ESPERADA, SUPERFICIE_TOTAL_ESPERADO);
		
		//Verificaci�n
				assertEquals(NOMBRE_ESPERADO, nuevo.getNombre());
				assertEquals(DUE�O_ESPERADO, nuevo.getDuenio());
				assertEquals(MANGA_ESPERADO, nuevo.getManga());
				assertEquals(CALADO_ESPERADO, nuevo.getCalado());
				assertEquals(ESLORA_ESPERADO, nuevo.getEslora());
				assertEquals(TRIPULACION_ESPERADO, nuevo.getTripulacion());
				assertEquals(PESO_ESPERADO, nuevo.getPeso());
				assertEquals(ALTURA_ESPERADO, ((YateAVela) nuevo).getAltura());
				assertEquals(SUPERFICIE_VELICA_MAYOR_ESPERADA, ((YateAVela) nuevo).getSuperficieVelicaMayor());
				assertEquals(SUPERFICIE_TOTAL_ESPERADO, ((YateAVela) nuevo).getSuperficieTotal());
	}
	
	@Test
	public void queSePuedaAmarrarUnYateAUnFondeadero() throws NoHayLugarParaAmarrarException{
		//Preparaci�n
		final Integer CANTIDAD_DE_YATES_AMARRADOS = 2;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		
		fondeadero.amarrarYate(new YateAVela("pepito", "juan", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0));
		fondeadero.amarrarYate(new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0));
		//Verificaci�n
		assertEquals(CANTIDAD_DE_YATES_AMARRADOS, fondeadero.getCantidadDeYates());
	}
	
	@Test
	public void queSePuedaDesamarrarUnYateEnUnFondeadero() throws NoHayLugarParaAmarrarException {
		//Preparaci�n
		final Integer CANTIDAD_DE_YATES_AMARRADOS = 0;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		Yate yate1 = new YateAVela("pepito", "juan", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate yate2 = new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0); 
		
		fondeadero.amarrarYate(yate1);
		fondeadero.amarrarYate(yate2);
		
		fondeadero.desamarrarYate(yate1);
		fondeadero.desamarrarYate(yate2);

		//Verificaci�n
		assertEquals(CANTIDAD_DE_YATES_AMARRADOS, fondeadero.getCantidadDeYates());
	}
	
	@Test
	public void queSePuedaObtenerLaCantidadDeYatesAmarrados() throws NoHayLugarParaAmarrarException {
		//Preparaci�n
		final Integer CANTIDAD_DE_YATES_AMARRADOS = 2;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		Yate yate1 = new YateAVela("pepito", "juan", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate yate2 = new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0); 
		
		fondeadero.amarrarYate(yate1);
		fondeadero.amarrarYate(yate2);
		
		//Verificaci�n
		assertEquals(CANTIDAD_DE_YATES_AMARRADOS, fondeadero.getCantidadDeYates());
	}
	
	@Test
	public void queSePuedaObtenerLaCantidadDeAmarresDisponibles() throws NoHayLugarParaAmarrarException {
		//Preparaci�n
		final Integer CANTIDAD_DE_AMARRES_DISPONIBLES = 1;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		Yate yate1 = new YateAVela("pepito", "juan", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate yate2 = new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0); 
		
		fondeadero.amarrarYate(yate1);
		fondeadero.amarrarYate(yate2);
		
		//Verificaci�n
		assertEquals(CANTIDAD_DE_AMARRES_DISPONIBLES, fondeadero.obtenerCantidadDeAmarrasDisponibles());
	}
	
	@Test
	public void queSePuedaObtenerElPrecioDelAmarre() throws NoHayLugarParaAmarrarException {
		//Preparaci�n
		final Double PRECIO_ESPERADO = 13000.0;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		Yate yate2 = new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0); 
		
		fondeadero.amarrarYate(yate2);
		
		//Verifici�n
		assertEquals(PRECIO_ESPERADO, fondeadero.obtenerPrecioDeAmarre(yate2));
	}
	
	@Test
	public void queSePuedaObtenerLaRecaudacionTotal() throws NoHayLugarParaAmarrarException {
		//Preparaci�n
		final Double PRECIO_ESPERADO = 24000.0;
		
		//Ejecuci�n
		Fondeadero fondeadero = new Fondeadero("Cacatua", 3);
		Yate yate1 = new YateAVela("pepito", "juan", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate yate2 = new YateMotor("caquita", "jose", 18.87, 5.17, 119.0, 37, 5500.0, 5959.0, "2 x motores di�sel MAN RK2805", 9000.0, 23.0, 6500.0); 
		
		fondeadero.amarrarYate(yate1);
		fondeadero.amarrarYate(yate2);
		
		//Verifici�n
		assertEquals(PRECIO_ESPERADO, fondeadero.obtenerRecaudacionTotal());
	}
}
