package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

import org.junit.Assert;
import org.junit.Test;

public class DepartamentoTest {

	@Test
	public void testCrearDepartamento() {
		Date fNac = new Date(100, 9, 5);
		Gerente ge1 = new Gerente("Perez Marcos", 11000.00, fNac, 15);
		Departamento dpto = new Departamento("IT", 2, ge1);
		Assert.assertNotNull(dpto);
	}
}