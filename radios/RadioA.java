package radios;

import radios.interfaces.ClaseCarroA;

public class RadioA extends Radio implements ClaseCarroA {
    String[] ultimoContacto = null;  // 0:Nombre  1:Numero

    /**
     * Constructor del radio A
     */
    public RadioA(){
        this.tiporadio = "Clase A";
    }


    /**
     * Se llama al último contacto llamado
     * @return mensaje
     */
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

    /**
     * Muestra la tarjeta de presentación de ejemplo (sala de ventas)
     * @return mensaje
    */
    @Override
    public String verTarjetasPresentacion() {  //https://www.mercedes-benz.com.gt/asesores-de-ventas
        String mensaje = "Nombre: MARIA JOSE SOLARES \n";
        mensaje += "Empresa: Mercedes-Benz\n";
        mensaje += "Número: 23168308\n";
        return mensaje;
    }

    public String llamar(int contacto){
		String mensaje = "";

		try {
			String[] contactoElegido = contactos[contacto];
            ultimoContacto = contactoElegido;
			enLlamada = true;
			mensaje = "Llamando a: " + contactoElegido[0];
		} catch (Exception e) {
			mensaje = "No se ha encontrado el contacto.";
		}

		return mensaje;
	}
}
