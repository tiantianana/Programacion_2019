
public class JugadorFutbol2 {
	
	public static void main(String[] args)
	{
		JugadorFutbol JF1 = new JugadorFutbol("Cristiano", "Ronaldo", 31, "delantero", "Realmadrid");
		JugadorFutbol JF2 = new JugadorFutbol(null, null, 0, null, null);
		
		JF2.nombre = JF1.nombre;
		JF2.apellido = JF1.apellido;
		JF2.edad = JF1.edad;
		JF2.posicion = JF1.posicion;
		JF2.equipo = JF1.equipo;
		
		JugadorFutbol JF3 = JF1;
		
		JF1.edad = 40;
		JF1.equipo = "Portugal";
		
		System.out.println(JF1.nombre+ " " +JF1.apellido+ " " +JF1.edad+ " " +JF1.posicion+ " " +JF1.equipo+ " . ");
		System.out.println(JF2.nombre+ " " +JF2.apellido+ " " +JF2.edad+ " " +JF2.posicion+ " " +JF2.equipo+ " . ");
		System.out.println(JF3.nombre+ " " +JF3.apellido+ " " +JF3.edad+ " " +JF3.posicion+ " " +JF3.equipo+ " . ");
		
		
		
		
		
		
	}
	
	
	
}
