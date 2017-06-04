package ar.edu.unlam.pb2.empleados;

import java.sql.Date;
import org.junit.Assert;
import org.junit.Test;

public class DirectorTest {

	@Test
	public void testCrearDirector() {
		Date fNac = new Date(61, 4, 10);
		Director di1 = new Director("Rodriguez Nicolas", 21000.00, fNac, 1);
		Assert.assertNotNull(di1);
	}

	@Test
	public void testGetNombre() {
		Date fNac = new Date(61, 4, 10);
		Director di1 = new Director("Rodriguez Nicolas", 21000.00, fNac, 1);
		String sEsperado = "Rodriguez Nicolas";
		String sObtenido = di1.getNombre();
		Assert.assertEquals(sEsperado, sObtenido);
	}

	@Test
	public void testGetFNac() {
		Date fNac = new Date(61, 4, 10);
		Director di1 = new Director("Rodriguez Nicolas", 21000.00, fNac, 1);
		String sEsperado = "1961-05-10";
		String sObtenido = di1.getFechaNacimiento().toString();
		Assert.assertEquals(sEsperado, sObtenido);
	}

	@Test
	public void testImpuesto() {
		Date fNac = new Date(61, 4, 10);
		Director di1 = new Director("Rodriguez Nicolas", 21000.00, fNac, 1);
		Double dEsperado = 1000.00 * 0.175;
		Double dObtenido = di1.calcularImpuesto();
		Assert.assertEquals(dEsperado, dObtenido);
	}

	@Test
	public void testEstacionamiento() {
		Date fNac = new Date(61, 4, 10);
		Director di1 = new Director("Rodriguez Nicolas", 21000.00, fNac, 1);
		Integer iEsperado = 1;
		Integer iObtenido = di1.getCochera();
		Assert.assertEquals(iEsperado, iObtenido);
	}
}