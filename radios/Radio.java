/**
* @author:  Mark Albrand & Jimena Hernández 
* @version: 14-Nov-21
* @file: Radio.java
* Esta clase es la clase madre de los radios.
**/
package radios;

public abstract class Radio {
    protected int contactoactual= -1;
    protected double[] emisorasGuardadas = new double[50];
    protected double emisoraactual= 87.5;
    protected String[][] contactos = {{"Olivia Rodrigo", "41395467"},{"Stephen Smitz","42118956"},{"Pepe Juarez","42245677"},{"Mark Albrand","34567764"},{"Jimena Hernández","41303714"}};
    protected String[][][] canciones = {{{"Been Away", "3.44", "Brent Faiyaz","Pop"},{"Dead man walkin", "4.07", "Brent Faiyaz","Pop"} ,{"Just a Stranger ", "2.58", "Kali Uchis","Pop"},{"Dark red ", "2.53", "Steve lacy","Hip-hop"},{"Carry me home ", "5.22", "Jorja Smith","Pop"}},{{"Lo siento BB:/", "3.27", "Bad bunny", "Reggaeton"}, {"Dakiti", "3.25", "Bad bunny","Reggaeton"}, {"La canción", "4.02", "J balvin", "Reggaeton"}, {"Red", "3.43", "Taylor Swift", "Pop"}, {"La fama", "3.08", "ROSALIA", "Reggaeton"}}};
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";
    protected boolean noPlaylist = false;
    protected String[][] playllistActual;
    protected String[] canciontActual;
	protected int indexCancion = 0;
    protected String tiporadio;



   /**
    * Cambia la frecuencia entre AM y FM
    * @param frecuencia
    * @return
    */
   public String cambiarAMFM(int frecuencia){
    String mensaje = " ";
    noPlaylist = true;
    switch(frecuencia){
        case 1:
        mensaje= " Se ha cambiado a la frecuencia FM";
        this.tipoFrecuencia= "FM";
        break;

        case 2:
        mensaje= " Se ha cambiado a la frecuencia AM";
        this.tipoFrecuencia= "AM";
        break; 

    }
    return mensaje;
   }

   /**
    * Cambia la emisora en cambios incrementales de 0.5
    * @return mensaje
    */
   public String cambiarEmisora(){
     String mensaje="";
     noPlaylist = true;
    if(emisoraactual!= 108.0){
        emisoraactual += 0.5;
        mensaje = "Se ha cambiado a la emisora: "+ emisoraactual;
    }else{
        emisoraactual= 87.5;
        mensaje = "Se ha cambiado a la emisora: "+ emisoraactual;
    }
    return mensaje;
   }

   /**
    * Se guarda la emisora actual en el primer espacio disponible
    * @return mensaje
    */
   public String guardarEmisora(){
    noPlaylist = true;
    String mensaje="";
    for (int i = 0; i < emisorasGuardadas.length; i++) {
        if (emisorasGuardadas[i] == 0.0){
            emisorasGuardadas[i] = emisoraactual;
            mensaje= " Se ha guardado la emisora correctamente en la posición " + (i+1);
            break;
        }
    }
    return mensaje;
   }

   /**
    * Se carga la emisora elegida por el usuario
    * @param emisora
    * @return
    */
   public String cargarEmisora(double emisora){
       String mensaje = "";
       noPlaylist = true;
       if(emisora >= 87.5 & emisora <= 108.0){
           this.emisoraactual = emisora;
           mensaje = "Se está escuchando la estación: " + emisora;
       }else{
           mensaje = "No se pudo cargar la emisora";
       }
       return mensaje;
   }

   /**
    * Se elige una de las listas de reproducción de prueba
    * @param index
    * @return mensaje
    */
   public String seleccionarListaReproduccion(int index){
	   String mensaje = "";
       noPlaylist = false;
       switch (index) {
		   case 1:
			   playllistActual = canciones[0];
			   canciontActual = playllistActual[0];
			   mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";
			   break;
	   
			case 2:
			   playllistActual = canciones[1];
			   canciontActual = playllistActual[0];
			   mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";
               break;
		   default:
		   	mensaje = "No se pudo seleccionar la lista de reproduccion deseada";
	   }
	   return mensaje;
   }

   /**
    * Cambia la canción
    * @param direccion
    * @return mensaje
    */
   public String cambiarCancion(int direccion){
       noPlaylist = false;
       String mensaje = "";

       if(playllistActual != null){
           switch (direccion) {
               case 1:  // Adelante
                   if (indexCancion >= (playllistActual.length-1) ) {
                       canciontActual = playllistActual[0];
                   }else{
                       indexCancion++;
                       canciontActual = playllistActual[indexCancion];
                   }
                   break;
                case 2:  // Atrás
                   if (indexCancion <= 1 ) {
                       canciontActual = playllistActual[playllistActual.length-1];
                   }else{
                       indexCancion--;
                       canciontActual = playllistActual[indexCancion];
                   }
                   break;
               default:
                   break;
           }
           mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";

       }else{
           mensaje = "No tiene una playlist activa.\n";
       }
	    

	   return mensaje;
   }

   /**
    * Inicia la reproducción de la playlist
    * @return mensaje
    */
   public String escucharCancion(){
       noPlaylist = false;
	   String mensaje ="";
	   if(playllistActual != null){
		   canciontActual = playllistActual[0];
		   mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";
		}else{
			mensaje ="No tiene una playlist activa.";
		}
		return mensaje;
	}

    /**
     * Se conecta el teléfono al radio
     * @return mensaje
     */
    public String conectarTelefono(){
        String mensaje ="Se ha conectado el teléfono correctamente";
        return mensaje;
    }

    /**
     * Se regresan los contactos de prueba
     * @return contactos
     */
    public String[][] getContactos(){
        return contactos;
    }

    /**
     * Se enciende el radio
     * @return mensaje
     */
    public String encender(){
        String mensaje ="";
        if (encendido == false){
            encendido=true;
            mensaje= "Se ha encendido el radio";
        }else{
            encendido=false;
            mensaje= "Se ha apagado el radio";
        }
        return mensaje;
    }

    /**
     * Se llama a uno de los contactos registrados
     * @param contacto
     * @return mensaje
     */
	public String llamar(int contacto){
		String mensaje = "";

		try {
			String[] contactoElegido = contactos[contacto];
			enLlamada = true;
            contactoactual = contacto;
			mensaje = "Llamando a: " + contactoElegido[0];
		} catch (Exception e) {
			mensaje = "No se ha encontrado el contacto.";
		}

		return mensaje;
	}

    /**
     * Se termina la llamada si está en curso
     * @return mensaje
     */
	public String finalizarLlamada(){
		String mensaje = "";
		if (enLlamada) {
			enLlamada = false;
			mensaje = "Se ha finalizado la llamada";
            contactoactual = -1;
		}else{
			mensaje = "No hay llamadas activas por ahora";
		}
		return mensaje;
    }

    /**
     * Se devuelve la pantalla del auto
     * @return string 
     * */    
    public String toString(){
        String  mensaje = "\n\n######################### Pantalla #########################\n" ;
        mensaje += tiporadio+ "\n";
        if(noPlaylist){//modo radio
            mensaje += "Frecuencia: "+ tipoFrecuencia+ "\n";
            mensaje += "Emisora actual: "+ emisoraactual+ "\n";
           for (int i = 0; i < emisorasGuardadas.length; i++) {
               if(emisorasGuardadas[i]== emisoraactual){
                   mensaje += "Emisora favorita: "+ (i+1) + "\n";
               }
           }
        }else{ //modo playlist
            if(canciontActual != null){
                mensaje += "Reproduciendo: " + canciontActual[0]+ " de " + canciontActual[2] + " ("+ canciontActual[3]+ ")"+"\n";
            }        
        }
        if(enLlamada){
            mensaje += "Tiene una llamada en curso. "+"\n";
        }else{
            mensaje += "No está en una llamada actualmente\n";
        }
        return mensaje;
    }

    /**
     * Se regresa el estado del radio
     * @return encendido
     */
    public boolean getEncendido(){
        return encendido;
    }

}
