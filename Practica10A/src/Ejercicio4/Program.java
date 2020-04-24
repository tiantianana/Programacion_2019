package Ejercicio4;

public class Program {

	public static void main(String[] args) {
		isla tahiti = new isla("Tahiti", 21.3069,  -157.8583, "Polinesia Francesa", true);
		isla hawaii = new isla("Hawaii", 19.590615,  -155.424133, "Estados Unidos", true);
		avion SKW5851 = new avion("SKW5851", tahiti, hawaii, 235, estadoavion.lleganatiempo, "United Airlines");
		pasajero pasajero1 = new pasajero("Pedro", "Jimenez", "A2735B07", SKW5851);
		pasajero pasajero2 = new pasajero("Jorge", "Sánchez", "A2735B08", SKW5851);
		pasajero pasajero3 = new pasajero("Juan", "Magán", "A2735B10", SKW5851);		
	}

}
