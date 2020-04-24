
public class APersona {

			protected String Nombre;
			protected String PrimerApellido;
			protected String SegundoApellido;
		
	
		public String getNombre() 
		{
			return Nombre;
		}
		
		public void setNombre(String nombre) 
		{
			if (nombre != null && nombre.length()>0)
			{
			Nombre = nombre;
			}
		}
		
		public static void main(String[] args) {
			
		APersona p1 = new APersona();
		p1.setNombre("X");
		
		String nombre = p1.getNombre();
		
		APersona p3 = p1;
		p3.setNombre("Y");
		
		APersona p2 = new APersona();
		p2.setNombre(p1.getNombre());
		
		System.out.println(p1.getNombre()); // Cambia el valor de p1 por p2 ya que apuntan a la misma dirección.
	
		} 
		
		public APersona Clone() {
			APersona cloned = new APersona();
			// String miNombre = getNombre();
			// cloned.setNombre(miNombre);
			// cloned.setNombre(this.Nombre);
			cloned.Nombre = Nombre;
			cloned.PrimerApellido = PrimerApellido;
			cloned.SegundoApellido = SegundoApellido;

			return cloned;
			
		}

}

