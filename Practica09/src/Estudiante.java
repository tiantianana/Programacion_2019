	import java.util.Scanner;
	public class Estudiante 
		{

		private String nombre;
		private String apellido;
		private double notaProgramacion;
		private double notaAlgebra;
		private double notaCalculo;
		private double notaFisica;
		private double notaEscritura;
		private double notaInformacion;
	

			public String getnombre() 
			{
				return nombre;
			}
			public void setnombre(String nombre)
			{

				this.nombre = nombre;
				
			}
			
			public String getapellido() 
			{
				return apellido;
			}
			public void setapellido(String apellido)
			{
				this.apellido = apellido;
				
			}
			
			public double getnotaProgramacion()
			{
				return getNotaProgramacion();
			}
			public void setnotaProgramacion(double notaProgramacion)
			{
				if(notaProgramacion <= 10 && notaProgramacion >= 0)
				{
					this.setNotaProgramacion(notaProgramacion);
				}
				else 
				{
					notaProgramacion = 0;
				}
			}
			public double getnotaAlgebra()
			{
				return getNotaAlgebra();
			}
			public void setnotaAlgebra(double notaAlgebra)
			{
				if(notaAlgebra <= 10 && notaAlgebra >= 0)
				{
					this.setNotaAlgebra(notaAlgebra);
				}
				else 
				{
					notaAlgebra = 0;
				}
			}
			
			public double getnotaCalculo()
			{
				return notaCalculo;
			}
			public void setnotaCalculo(double notaCalculo)
			{
				if(notaCalculo <= 10 && notaCalculo >= 0)
				{
					this.notaCalculo = notaCalculo;
				}
				else 
				{
					notaCalculo = 0;
				}
			}
			
			public double getnotaFisica()
			{
				return getNotaFisica();
			}
			public void setnotaFisica(double notaFisica)
			{
				if(notaFisica <= 10 && notaFisica >= 0)
				{
					this.setNotaFisica(notaFisica);
				}
				else 
				{
					notaFisica = 0;
				}
			}
			
			public double getnotaEscritura()
			{
				return notaEscritura;
			}
			public void setnotaEscritura(double notaEscritura)
			{
				if(notaEscritura <= 10 && notaEscritura >= 0)
				{
					this.notaEscritura = notaEscritura;
				}
				else 
				{
					notaEscritura = 0;
				}
			}
			
			public double getnotaInformacion()
			{
				return notaInformacion;
			}
			public void setnotaInformacion(double notaInformacion)
			{
				if(notaInformacion <= 10 && notaInformacion >= 0)
				{
					this.notaInformacion = notaInformacion;
				}
				else 
				{
					notaInformacion = 0;
				}
			}
			
	
			public static void main(String[] args) {
				
				Estudiante E1 = new Estudiante();
				
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Digame su nombre");
				String nombre = teclado.nextLine();
				E1.setnombre(nombre);
				nombre = E1.getnombre();
				
				System.out.println("Digame su apellido");
				String apellido = teclado.nextLine();
				E1.setapellido(apellido);
				apellido = E1.getapellido();
				
				System.out.println("Digame su nota en programación");
				double notaProgramacion = teclado.nextDouble();
				E1.setnotaProgramacion(notaProgramacion);
				notaProgramacion = E1.getnotaProgramacion();
				
				
				System.out.println("Digame su nota en algebra");
				double notaAlgebra = teclado.nextDouble();
				E1.setnotaAlgebra(notaAlgebra);
				notaAlgebra = E1.getnotaAlgebra();
				
				System.out.println("Digame su nota en calculo");
				double notaCalculo = teclado.nextDouble();
				E1.setnotaCalculo(notaCalculo);
				notaCalculo= E1.getnotaCalculo();
				
				System.out.println("Digame su nota en fisica");
				double notaFisica = teclado.nextDouble();
				E1.setnotaFisica(notaFisica);
				notaFisica= E1.getnotaFisica();
				
				System.out.println("Digame su nota en escritura");
				double notaEscritura = teclado.nextDouble();
				E1.setnotaEscritura(notaEscritura);
				notaEscritura= E1.getnotaEscritura();
				
				System.out.println("Digame su nota en informacion");
				double notaInformacion = teclado.nextDouble();
				E1.setnotaInformacion(notaInformacion);
				notaInformacion= E1.getnotaInformacion();
				
				
			System.out.println(nombre);	
			System.out.println(apellido);	
			System.out.println(notaProgramacion);	
			System.out.println(notaAlgebra);	
			System.out.println(notaCalculo);	
			System.out.println(notaFisica);	
			System.out.println(notaEscritura);	
			System.out.println(notaInformacion);	
			
			
			teclado.close();
			
			}
			public double getNotaProgramacion() {
				return notaProgramacion;
			}
			public void setNotaProgramacion(double notaProgramacion) {
				this.notaProgramacion = notaProgramacion;
			}
			public double getNotaAlgebra() {
				return notaAlgebra;
			}
			public void setNotaAlgebra(double notaAlgebra) {
				this.notaAlgebra = notaAlgebra;
			}
			public double getNotaFisica() {
				return notaFisica;
			}
			public void setNotaFisica(double notaFisica) {
				this.notaFisica = notaFisica;
			}			
}