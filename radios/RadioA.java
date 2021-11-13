package radios;

import radios.interfaces.ClaseCarroA;

public class RadioA extends Radio implements ClaseCarroA {
    String[] ultimoContacto = null;  // 0:Nombre  1:Numero

    @Override
    public String llamarUltimoContacto() {
        String mensaje = "";
        if (ultimoContacto != null & !this.enLlamada) {
            mensaje = "Llamando a " + ultimoContacto[0];
        }else if(ultimoContacto != null & this.enLlamada){
            mensaje = "Tiene una llamada en progreso.";
        }else{
            mensaje = "No se tiene un útlimo contacto registrado.";
        }

        return mensaje;
    }

    @Override
    public String verTarjetasPresentacion() {  //https://www.mercedes-benz.com.gt/asesores-de-ventas
        String mensaje = "Nombre: MARIA JOSE SOLARES \n";
        mensaje += "Empresa: Mercedes-Benz\n";
        mensaje += "Número: 23168308\n";
        return mensaje;
    }
}
