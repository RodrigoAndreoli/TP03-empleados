package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

import org.junit.Assert;
import org.junit.Test;

public class GerenteTest {

	@Test
	public void testCrearGerente() {
		Date fNac = new Date(100, 9, 5);
		Gerente ge1 = new Gerente("Perez Marcos", 11000.00, fNac, 15);
		Assert.assertNotNull(ge1);
	}

	@Test
	public void testGetNombre() {
		Date fNac = new Date(100, 9, 5);
		Gerente ge1 = new Gerente("Perez Marcos", 11000.00, fNac, 15);
		String sEsperado = "Perez Marcos";
		String sObtenido = ge1.getNombre();
		Assert.assertEquals(sEsperado, sObtenido);
	}

	@Test
	public void testGetFNac() {
		Date fNac = new Date(100, 9, 5);
		Gerente ge1 = new Gerente("Perez Marcos", 11000.00, fNac, 15);
		String sEsperado = "2000-10-05";
		String sObtenido = ge1.getFechaNacimiento().toString();
		Assert.assertEquals(sEsperado, sObtenido);
	}
}