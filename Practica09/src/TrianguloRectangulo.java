
import java.util.Scanner;
public class TrianguloRectangulo {
	
	private float  base;
	private float altura;
	


	public float getbase() 
	{
		return base;
	}
	public void setbase(float base)
	{
		this.base = base;
	}
	
	public float getaltura() 
	{
		return altura;
	}
	public void setaltura(float altura)
	{
		this.altura = altura;
	}
	
	
	public static void main (String[] args) {
		
	TrianguloRectangulo Tr = new TrianguloRectangulo();
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dame base");
	float base = teclado.nextFloat();
	Tr.setbase(base);
	base = Tr.getbase();
	
	
	System.out.println("Dame altura");
	float altura = teclado.nextFloat();
	Tr.setaltura(altura);
	altura = Tr.getaltura();
	
	
	System.out.println("Pulse 0 (para calcular el area) ó 1 (para caluclar el perimetro");
	int x = teclado.nextInt();
	
	do {	
		if(x==0) 
		{
		int area = (int) (base*altura)/2;
		System.out.print("El area del triangulo rectangulo es " +area);
		}
		else if(x==1) 
		{ 
		int perimetro = (int) (base+base+base);
		System.out.println("El perimetro del triangulo rectangulo es " +perimetro);
		}
		break;
	}
	while (x==1 || x==0);
	
	teclado.close();

	
	}	
}
