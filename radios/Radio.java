package radios;

public abstract class Radio {
    protected int contactoactual= -1;
    protected String[] emisorasGuardadas = new String[50];
    protected String[][] contactos;
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";
}
