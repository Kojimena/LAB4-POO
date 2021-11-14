package radios;

import java.util.Random;

import radios.interfaces.ClaseCarroS;

public class RadioS extends Radio implements ClaseCarroS {

    public RadioS(){
        this.tiporadio = "Clase S";
    }

    @Override
    public String cambiarBocinasAuriculares(int opcion) {
        String mensaje = "";
        switch (opcion) {
            case 1:
                mensaje = "Ahora se están utilizando sus bocinas";
                break;
            case 2:
                mensaje = "Ahora se están utilizando sus audífonos";
                break;
            default:
                mensaje = "Se ingresó una opción inválida. La frecuencia actual es: " + this.tipoFrecuencia;
                break;
        }
        return mensaje;
    }

    @Override
    public String planificarViaje(String destino) {
        String mensaje = "Se ha encontrado la ruta más rápida para llegar a " + destino;
        Random i = new Random();

        switch (i.nextInt(5)) {
            case 0:
                mensaje += ". Hay tráfico en la ruta.";
                break;
            case 1:
                mensaje += ". Hay un accidente en el camino, conduzca con cuidado.";
                break;
            case 2:
                mensaje += ". Va por la ruta más rápida.";
                break;
            case 3:
                mensaje += ". Hay una retención de " + i.nextInt(15) + " minutos";
                break;
            case 4:
                mensaje += ". La ruta contiene puestos de policía de tránsito, maneje con prudencia.";
                break;
        
            default:
                break;
        }

        return mensaje;
    }
}
