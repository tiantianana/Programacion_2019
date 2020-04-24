
	
	public class Fecha {
	public int dia;
	public String mes;
	public int año;
	public boolean esFestivo;
	
	public Fecha(int d)
	{
		dia = d;
	}
	
	
	
	public Fecha(int dia, String mes, int año, boolean esFestivo) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public boolean isFestivo() {
		return esFestivo;
	}
	public void setFestivo(boolean festivo) {
		this.esFestivo = festivo;
	}
	
	
	
	
	}
	

