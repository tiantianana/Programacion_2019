public class AProfesor extends APersona {

		protected int HorasLectivas;
		// Esto quiere decir que un profesor es una persona pero una persona no tiene porque ser un profesor.
		
		public AProfesor Clone() {
			
			AProfesor cloned = new AProfesor();
			
			cloned.setNombre(getNombre());
			cloned.PrimerApellido = PrimerApellido;
			cloned.SegundoApellido = SegundoApellido;

			return cloned;
		}
			
		public static void main(String[] args) {
				
				APersona p1 = new APersona();
				p1.setNombre("X");
				
				String nombre = p1.getNombre();
				
				APersona p3 = p1;
				p3.setNombre("Y");
				
				APersona p2 = new APersona();
				p2.setNombre(p1.getNombre());
				
				System.out.println(p1.getNombre()); 
				
				AProfesor profesor1 = new AProfesor();
				APersona profesor2 = new AProfesor();
				// Profesor profesor3 = new Persona(); Esto da error porque un profesor es una persona pero no todas las personas son profesores.		
				AProfesor profesor3 = new ACatedratico();
				// En este caso si se puede ya que un catedratico es un profesor.
		} 
	}

