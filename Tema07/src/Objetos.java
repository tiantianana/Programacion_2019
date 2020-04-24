
public class Objetos {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha(0, null, 0, false);
		f1.año = 2000;
		f1.mes = "Enero";
		f1.dia = 12;
		f1.esFestivo = false;
		
		System.out.print("Año: " + f1.año);
		
		Fecha f2 = new Fecha(0, null, 0, false);
		f2.año = 2001;
		f2.mes = "Febrero";
		f2.dia = 20;
		f2.esFestivo = false;
		
		System.out.print("Dia: " + f1.dia);

		
		}

	}


