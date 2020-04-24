package Ejercicio2;

public class Deposito {

	private Cliente Titular;
	private float Capital;
	protected int Plazo;
	private float Interes;
	
	public Deposito (Cliente Titular, float Capital, int Plazo, float Interes)
	{
		this.Titular = Titular;
		this.Capital = Capital;
		this.Plazo = Plazo;
		this.Interes = Interes;
	}

	public Cliente getTitular() 
    {
        return Titular;
    }
    
    public void setTitular(Cliente cliente) 
    {
        this.Titular = cliente;
    }


    public float getCapital() 
    {
        return Capital;
    }


    public void setCapital(float Capital) 
    {
        this.Capital = Capital;
    }


    public int getPlazo()
    {
        return Plazo;
    }


    public void setPlazo(int Plazo) 
    {
        this.Plazo = Plazo;
    }


    public float getInteres() 
    {
        return Interes;
    }


    public void setInteres(float Interes) 
    {
        this.Interes = Interes;
    }
    
    public float LiquidarDeposito()
    {
    	return this.Capital + this.Interes;
    }
    
    public float ConsultarIntereses()
    {
    	return (this.Capital * this.Interes) + this.Plazo;
    }
    
    
    
    
    
}
