package radios;

public abstract class Radio {
    protected int contactoactual= -1;
    protected String[] emisorasGuardadas = new String[50];
    protected double emisoraactual= 87.5;
    protected String[][] contactos = {{"Olivia Rodrigo", "41395467"},{"Stephen Smitz","42118956"},{"Pepe Juarez","42245677"},{"Mark Albrand","34567764"},{"Jimena Hernández","41303714"}};
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";


   abstract String pantalla();

   public String cambiarAMFM(int frecuencia){
    String mensaje = " ";
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
    if(emisoraactual!= 108.0){
        emisoraactual += 0.5;
        mensaje = "Se ha cambiado a la emisora: "+ emisoraactual;
    }else{
        emisoraactual= 87.5;
        mensaje = "Se ha cambiado a la emisora: "+ emisoraactual;
    }
    return mensaje;
   }


   
}
