
	
	public class Fecha {
	public int dia;
	public String mes;
	public int a�o;
	public boolean esFestivo;
	
	public Fecha(int d)
	{
		dia = d;
	}
	
	
	
	public Fecha(int dia, String mes, int a�o, boolean esFestivo) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.esFestivo = esFestivo;
	}



	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public boolean isFestivo() {
		return esFestivo;
	}
	public void setFestivo(boolean festivo) {
		this.esFestivo = festivo;
	}
	
	
	
	
	}
	

