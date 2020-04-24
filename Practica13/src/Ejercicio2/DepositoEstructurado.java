package Ejercicio2;

public class DepositoEstructurado extends Deposito {
	
	private int tramoFijo;
	private int tramoVariable;

	public DepositoEstructurado(Cliente Titular, float Capital, int Plazo, float Interes, int tramoFijo, int tramoVariable) 
	{
		super(Titular, Capital, Plazo, Interes);
		this.tramoFijo = tramoFijo;
		this.tramoVariable = tramoVariable;
	}
	
	public int getTramoFijo() 
	{
        return tramoFijo;
    }

    public void setTramoFijo(int tramoFijo) 
    {
        {
            this.tramoFijo = tramoFijo;
        }
    }
    
    public int getTramoVariable() {
        return tramoVariable;
    }

    public void setTramoVariable(int tramoVariable) {
    	{
            this.tramoVariable = tramoVariable;
        }
    }
    
	
    
	
}
