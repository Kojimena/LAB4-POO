package radios;

public abstract class Radio {
    protected int contactoactual= -1;
    protected String[] emisorasGuardadas = new String[50];
    protected String[][] contactos = {{"Olivia Rodrigo", "41395467"},{"Stephen Smitz","42118956"},{"Pepe Juarez","42245677"},{"Mark Albrand","34567764"},{"Jimena Hernández","41303714"}};
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";


    public Radio(){
    }
}
