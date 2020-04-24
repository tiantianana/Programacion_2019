
class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
}

	class Asignatura {
		private String nombre;
		private int cuatrimestre;
		private Fecha[] fechas;
		public String getNombre() {
			return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCuatrimestre() {
		return cuatrimestre;
	}
	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	public Fecha[] getFechas() {
		return fechas;
	}
	public void setFechas(Fecha[] fechas) {
		this.fechas = fechas;
	}
	


	public static void main(String[] args) {
		Asignatura calculo = new Asignatura(), principiosFisicos = new Asignatura();
		calculo.setCuatrimestre(1);
		principiosFisicos.setCuatrimestre(2);
		
		
		calculo.setFechas(new Fecha[] {
				new Fecha(5,11,18),
				new Fecha(6,11,18),
				new Fecha(12,11,18),
				new Fecha(13,11,18),
				new Fecha(19,11,18),
				new Fecha(20,11,18),
				new Fecha(26,11,18),
				new Fecha(27,11,18)
		});
		principiosFisicos.setFechas(null); //no hay clases de esta asignatura en noviembre!
	}
}
