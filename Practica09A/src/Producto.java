import java.util.Scanner;

class Producto {

	private String nombre;
	private float precio;
	private int cantidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Producto() {
		this.nombre = "";
		this.precio = 0;
		this.cantidad = 0;
	}

	public String toString() {
		return "Nombre: " + this.nombre + ", cantidad: " + this.cantidad + ", precio: " + this.precio + "�";
	}
}

public class Ejercicio05 {

	public static void main(String[] args) {

		Producto[] productos = new Producto[10];
		Scanner input = new Scanner(System.in);
		String nombreProducto;
		menu: while(true) {
			System.out.println("Men� - Selecciona una opci�n");
			System.out.println("1. Alta de producto");
			System.out.println("2. Buscar por nombre");
			System.out.println("3. Modificar stock y precio");
			System.out.println("4. Salir");
			System.out.println("Introduce el n�mero de la opci�n: ");
			switch(input.nextInt()) {
			case 1:
				altaProducto(productos, input);
				break;
			case 2:
				System.out.println("Introduce el nombre del producto a buscar: ");
				nombreProducto = input.next();
				buscarProducto(productos, nombreProducto);
				break;
			case 3:
				System.out.println("Introduce el nombre del producto a modificar: ");
				nombreProducto = input.next();
				Producto modProducto = buscarProducto(productos, nombreProducto);
				modificarProducto(modProducto, input);
				break;
			case 4:
				System.out.println("Saliendo...");
				break menu;
				default:
					System.out.println("Opci�n no reconocida.");
			}
		}
		input.close();
	}
	/* Se a�aden estos m�todos para no sobrecargar el main, aunque se crean y destruyen m�s objetos, simplifica mucho. */
	private static void altaProducto(Producto[] productos, Scanner input) {
		Producto nuevoProducto = new Producto();
		System.out.println("Introduce el nombre del producto a a�adir: ");
		nuevoProducto.setNombre(input.next());
		System.out.println("Introduce la cantidad del producto a a�adir: ");
		nuevoProducto.setCantidad(input.nextInt());
		System.out.println("Introduce el precio unitario del producto a a�adir: ");
		nuevoProducto.setPrecio(input.nextFloat());
		
		for(int i = 0; i < productos.length; i++) {
			if(productos[i] == null) {
				//posicion libre
				productos[i] = nuevoProducto;
				System.out.println("Producto a�adido: " + nuevoProducto);
				return;//terminar la funci�n para prevenir duplicados.
			}
		}
		System.out.println("No hay espacios libres en la tienda. No se pudo a�adir el producto" + nuevoProducto);
	}
	private static Producto buscarProducto(Producto[] productos, String nombreProducto) {
		for(Producto p:productos) {
			if(p != null && nombreProducto.equals(p.getNombre())) {
				System.out.println("Producto encontrado: " + p);
				return p;
			}
		}
		System.out.println("Producto no encontrado: " + nombreProducto);
		return null;
	}
	private static void modificarProducto(Producto producto, Scanner input) {
		if(null == producto) {
			return; //si es null no hacemos nada, ya que se ha buscado previamente.
		}
		System.out.println("Introduce la nueva cantidad de " + producto.getNombre());
		producto.setCantidad(input.nextInt());
		System.out.println("Introduce el nuevo precio unitario de " + producto.getNombre());
		producto.setPrecio(input.nextFloat());
	}
}
