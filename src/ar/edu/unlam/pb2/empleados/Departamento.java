package ar.edu.unlam.pb2.empleados;

public class Departamento {
	protected String nombre;
	protected Integer area;
	protected Gerente gerenteDpto;

	public Departamento(String nombre, Integer area, Gerente gerenteDpto) {
		super();
		this.nombre = nombre;
		this.area = area;
		this.gerenteDpto = gerenteDpto;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Integer getArea() {
		return area;
	}

	protected void setArea(Integer area) {
		this.area = area;
	}

	protected Gerente getGerenteDpto() {
		return gerenteDpto;
	}

	protected void setGerenteDpto(Gerente gerenteDpto) {
		this.gerenteDpto = gerenteDpto;
	}

}