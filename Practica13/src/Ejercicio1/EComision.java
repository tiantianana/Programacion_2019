package Ejercicio1;

public class EComision extends Empleado implements Constants {
    private int clientesCaptados;
    private float importePorCliente;

    public EComision(String numDNI, String nombre, String apellido, int añoIngreso, int clientesCaptados, float importePorCliente) {
        super(numDNI, nombre, apellido, añoIngreso);
        this.clientesCaptados = clientesCaptados;
        this.importePorCliente = importePorCliente;
    }

	public float obtenerSalario() {
        float salarioCalculado = this.clientesCaptados * this.importePorCliente;
        if(salarioCalculado < Constants.SalarioMinimoComision) {
            return Constants.SalarioMinimoComision;
        }
        else {
            return salarioCalculado;
        }
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public float getImportePorCliente() {
        return importePorCliente;
    }

    public void setImportePorCliente(float importePorCliente) {
        this.importePorCliente = importePorCliente;
    }
}
