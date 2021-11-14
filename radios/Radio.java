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


   abstract String pantalla();

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

   public String guardarEmisora(){
    noPlaylist = true;
    String mensaje="";
    for (int i = 0; i < emisorasGuardadas.length; i++) {
        if (emisorasGuardadas[i] == 0.0){
            emisorasGuardadas[i] = emisoraactual;
            mensaje= " Se ha guardado la emisora correctamente. ";
            break;
        }
    }
    return mensaje;
   }

   public String seleccionarListaReproduccion(int index){
	   String mensaje = "";
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
		   default:
		   	mensaje = "No se pudo seleccionar la lista de reproduccion deseada";
	   }
	   return mensaje;
   }
   public String cambiarCancion(int direccion){
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
				   canciontActual = playllistActual[playllistActual.length];
			   }else{
				   indexCancion--;
				   canciontActual = playllistActual[indexCancion];
			   }
			   break;
		   default:
			   break;
	   }
	   String mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";

	   return mensaje;
   }

   public String escucharCancion(){
	   String mensaje ="";
	   if(playllistActual != null){
		   canciontActual = playllistActual[0];
		   mensaje = "Se está reproduciendo: " + canciontActual[0] + " de " + canciontActual[2] + " (" + canciontActual[1] + ")";
		}else{
			mensaje ="No tiene una playlist activa.";
		}
		return mensaje;
		}

}
