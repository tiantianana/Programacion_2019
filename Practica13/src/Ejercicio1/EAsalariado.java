package Ejercicio1;

public class EAsalariado extends Empleado {
    private float sueldoBasico;

    public EAsalariado(String numDNI, String nombre, String apellido, int añoIngreso, float sueldoBasico) {
        super(numDNI, nombre, apellido, añoIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public float ObtenerSalario() {
    	int añoActual = 2018;
        int añosAntiguedad = añoActual - this.getAñoIngreso();
        
        
        if(añosAntiguedad < 2) {
            return this.sueldoBasico;
        }
        else if(añosAntiguedad > 2 && añosAntiguedad < 3) {
            return this.sueldoBasico + (this.sueldoBasico * 5/100);
        }
        else if(añosAntiguedad > 4 && añosAntiguedad < 7) {
            return this.sueldoBasico + (this.sueldoBasico * 10/100);
        }
        else if(añosAntiguedad > 8 && añosAntiguedad < 15) {
            return this.sueldoBasico + (this.sueldoBasico * 15/100);
        }
        else {
            return this.sueldoBasico + (this.sueldoBasico * 20/100);
        }
    }
}
