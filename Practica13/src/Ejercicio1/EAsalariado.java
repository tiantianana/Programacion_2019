package Ejercicio1;

public class EAsalariado extends Empleado {
    private float sueldoBasico;

    public EAsalariado(String numDNI, String nombre, String apellido, int a�oIngreso, float sueldoBasico) {
        super(numDNI, nombre, apellido, a�oIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public float ObtenerSalario() {
    	int a�oActual = 2018;
        int a�osAntiguedad = a�oActual - this.getA�oIngreso();
        
        
        if(a�osAntiguedad < 2) {
            return this.sueldoBasico;
        }
        else if(a�osAntiguedad > 2 && a�osAntiguedad < 3) {
            return this.sueldoBasico + (this.sueldoBasico * 5/100);
        }
        else if(a�osAntiguedad > 4 && a�osAntiguedad < 7) {
            return this.sueldoBasico + (this.sueldoBasico * 10/100);
        }
        else if(a�osAntiguedad > 8 && a�osAntiguedad < 15) {
            return this.sueldoBasico + (this.sueldoBasico * 15/100);
        }
        else {
            return this.sueldoBasico + (this.sueldoBasico * 20/100);
        }
    }
}
