package EjercicioB;


public class CentroControl {
    public static void main(String[] args) {
        Sensor[] sensores = new Sensor[20];
        Random rand = new Random();
        int numSensor = 1;
        for(int i = 0; i < sensores.length; i++) {
            sensores[i] = new Sensor();
            sensores[i].setDireccionLocalizacion("Desconocido");
            sensores[i].setMedidorHumedad(45);
            sensores[i].grabarTemperatura(rand.getRandomIntRange(30,40));
        }
        Sensor sensorExtra = new Sensor();
        sensorExtra.setMedidorHumedad(25);
        sensorExtra.grabarTemperatura(32.3F);

        //Calibrar ultimo sensor con el sensor extra
        sensores[sensores.length-1].calibrar(sensorExtra);

        //Imprimir por pantalla :)
        for(Sensor sensor:sensores) {
            if(sensor.hayAlarma(35,30)) {
                System.out.println(sensor);
            }
        }
    }
}
