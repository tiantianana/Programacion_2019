package Ejercicio1;

public class Hora {
	
	private int horas;
	private int minutos;
	private boolean formato24H;
	
	
	public Hora (boolean formato24H)
	{
		if(formato24H == true)
		{
			this.formato24H = formato24H;
			this.horas = 12;
			this.minutos = 00;
		}
	}
	
	public int getHoras()
	{
		return horas;
	}
	
	public void setHoras(int horas)
	{
		if (horas<24)
		{
			this.horas = horas;
		}
	}
	
	public int getMinutos()
	{
		return minutos;
	}
	
	public void setMinutos(int minutos)
	{
		if (minutos < 60)
		{
			this.minutos = minutos;
		}
	}
	
	public boolean getFormato24H()
	{
		return formato24H;
	}
	
	public void setFormato(boolean formato24H)
	{
		this.formato24H = formato24H;
	}
	
	public void ponerHora(String horaTexto)
	{
		String horas = horaTexto.charAt(0) + "" + horaTexto.charAt(1);
        String minutos = horaTexto.charAt(3) + "" + horaTexto.charAt(4);
		this.horas = Integer.parseInt(horas);
		this.minutos = Integer.parseInt(minutos);
	}
	
	@Override
    public String toString() {
        String vuelta = null;
        if (formato24H == true) {
            vuelta = horas + ":" + minutos;
        } else if (formato24H == false){
            if (horas > 12) {
                vuelta = (horas-12) + ":" + minutos + " PM";
            } else {
                vuelta = horas + ":" + minutos + " AM";
            }
        }
        return vuelta;
    }

				
	@Override
	public boolean equals(Object obj) {
		Hora other = (Hora) obj; //Esto hace un casting de obj a un objeto de tipo Hora y lo almacena en un nuevo objeto para ser comparado.
	      if (this.horas == other.horas && this.minutos == other.minutos && this.formato24H == other.formato24H) 
	      {
	          return true;
	      } else 
	    	  return false;
	    }
	
}
