package radios;

import radios.interfaces.ClaseCarroC;
import java.util.Random;

public class RadioC extends Radio implements ClaseCarroC {
    @Override
    public String llamadaEnEspera() {
        String mensaje = " ";
        if (this.contactoactual != -1 & this.enLlamada){
            mensaje= "Se ha puesto en espera a "+ this.contactos[this.contactoactual][0];
        }else {
            mensaje = "No tiene una llamada activa";
        }
        return mensaje;
    }

    @Override
    public String pronosticoTiempo() {
        String mensaje = "El día de hoy el día estará ";
        Random i = new Random();

        switch (i.nextInt(5)) {
            case 0:
                mensaje += " nublado. ";
                break;
            case 1:
                mensaje += " lluvioso. ";
                break;
            case 2:
                mensaje += " soleado, con un cielo despejado.";
                break;
            case 3:
                mensaje += " con una temperatura de 16 grados celcius.";
                break;
            case 4:
                mensaje += " con una tormenta electrica. ";
                break;
        
            default:
                break;
        }

        return mensaje;
    }

}
