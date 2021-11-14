package radios;

public abstract class Radio {
    protected int contactoactual= -1;
    protected String[] emisorasGuardadas = new String[50];
    protected String[][] contactos = new String[5][2];
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";
}
