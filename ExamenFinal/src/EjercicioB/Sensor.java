package EjercicioB;

import java.util.Arrays;

public class Sensor {
    private String codigoIdentificacion;
    private String direccionLocalizacion;
    private float medidorHumedad;
    private float[] termometro;

    public Sensor() {
        termometro = new float[24];
    }

    public Sensor(String codigoIdentificacion, String direccionLocalizacion, float humedadRelativa, float[] termometro) {
        setCodigoIdentificacion(codigoIdentificacion);
        setDireccionLocalizacion(direccionLocalizacion);
        setMedidorHumedad(humedadRelativa);
        setTermometro(termometro);
    }

    public String getDireccionLocalizacion() {
        return direccionLocalizacion;
    }

    public void setDireccionLocalizacion(String direccionLocalizacion) {
        this.direccionLocalizacion = direccionLocalizacion;
    }

    public float getMedidorHumedad() {
        return medidorHumedad;
    }

    public void setMedidorHumedad(float humedad) {
        if(humedad > 100) {
            humedad = 100;
        }
        else if(humedad < 0) {
            humedad = 0;
        }
        this.medidorHumedad = medidorHumedad;
    }
    public void grabarTemperatura(float nuevaTemperatura) {
        for(int i = this.termometro.length - 1; i >= 0 ;i--) {
            if(i > 0) {
                this.termometro[i] = this.termometro[i - 1];
            }
            else {
                this.termometro[i] = nuevaTemperatura;
            }
        }
    }

    public float temperaturaMedia() {
        float sumatorioTemperaturas = 0;
        for(float temperatura:this.termometro) {
            sumatorioTemperaturas += temperatura;
        }

        return sumatorioTemperaturas/this.termometro.length;
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public float[] getTermometro() {
        return termometro;
    }

    public void setTermometro(float[] termometro) {
        this.termometro = termometro;
    }

    public String toString() {
        return "Ubicación: " + this.direccionLocalizacion + "/n Ultima temperatura: " + this.termometro[0]; //Y poner todo lo que querais...
    }

    public void calibrar(Sensor sensor) {
        setTermometro(sensor.getTermometro());
        setMedidorHumedad(sensor.getMedidorHumedad());
    }

    public boolean hayAlarma(float temperaturaMaxima, float humedadMinima) {
        if(this.medidorHumedad < humedadMinima || this.temperaturaMedia() > temperaturaMaxima) {
            return true;
        }

        return false;
    } 
}

