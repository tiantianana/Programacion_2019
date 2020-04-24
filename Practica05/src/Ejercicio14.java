public class Ejercicio14 {
	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("Introduzca una cantidad de dinero:");
		float cantidad = teclado.nextFloat();
			
		int billetesde500 = 0;
		while(cantidad >= 500) {
		cantidad -= 500;
		billetesde500++;
		}
		if(billetesde500 > 0) {
			System.out.println(billetesde500 + " Billetes de 500€,");
		}

		int billetesde200 = 0;
		while(cantidad >= 200) {cantidad -= 200; billetesde200++;
		}
		if(billetesde200 > 0) {
			System.out.println(billetesde200 + " billetes de 200€,");
		}

		int billetesde100 = 0;
		while(cantidad >= 100) {cantidad -= 100; billetesde100++;
		}
		if(billetesde100 > 0) {
			System.out.println(billetesde100 + " billetes de 100€,");
		}
		

		int billetesde50 = 0;
		while(cantidad >= 50) {cantidad -= 50; billetesde50++;
		}
		if(billetesde50 > 0) {
			System.out.println(billetesde50 + " billetes de 50€,");
		}

		int billetesde20 = 0;
		while(cantidad >= 20) {cantidad -= 20; billetesde20++;
		}
		if(billetesde20 > 0) {
			System.out.println(billetesde20 + " billetes de 20€,");
		}

		int billetesde10 = 0;
		while(cantidad >= 10) {cantidad -= 10; billetesde10++;
		}
		if(billetesde10 > 0) {
			System.out.println(billetesde10 + " billetes de 10€,");
		}

		int billetesde5 = 0;
		while(cantidad >= 5) {cantidad -= 5; billetesde5++;
		}
		if(billetesde5 > 0) {
			System.out.println(billetesde50 + " billetes de 5€,");
		}

		int monedasde2 = 0;
		while(cantidad >= 2) {cantidad -= 2; monedasde2++;
		}
		if(monedasde2 > 0) {
			System.out.println(monedasde2 + " monedas de 2€,");
		}

		int monedasde1 = 0;
		while(cantidad >= 1) {cantidad -= 1; monedasde1++;
		}
		if(monedasde1 > 0) {
			System.out.println(monedasde1 + " monedas de 1€,");
		}

		int monedasde50 = 0;
		while(cantidad >= 0.5) {cantidad -= 0.5; monedasde50++;
		}
		if(monedasde50 > 0) {
			System.out.println(monedasde50 + " monedas de 0.50€,");
		}

		int monedasde20 = 0;
		while(cantidad >= 0.2) {cantidad -= 0.2; monedasde20++;
		}
		if(monedasde20 > 0) {
			System.out.println(monedasde20 + " monedas de 0.20€,");
		}
		
		int monedasde10 = 0;
		while(cantidad >= 0.1) {cantidad -= 0.1; monedasde10++;
		}
		if(monedasde10 > 0) {
			System.out.println(monedasde10 + " monedas de 0.10€,");
		}
		
		int monedasde5 = 0;
		while(cantidad >= 0.05) {cantidad -= 0.05; monedasde5++;
		}
		if(monedasde5 > 0) {
			System.out.println(monedasde5 + " monedas de 0.05€,");
		}
		
		int monedasde02 = 0;
		while(cantidad >= 0.02) {cantidad -= 0.02; monedasde02++;
		}
		if(monedasde02 > 0) {
			System.out.println(monedasde02 + " monedas de 0.02€,");
		}
		
		int monedasde01 = 0;
		while(cantidad >= 0.01) {cantidad -= 0.01; monedasde01++;
		}
		if(monedasde01 > 0) {
			System.out.println(monedasde01 + " monedas de 0.01€,");
			
		teclado.close();
		}
	}
}