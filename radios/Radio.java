package radios;

public abstract class Radio {
    protected String[] emisorasGuardadas = new String[50];
    protected Boolean encendido = false;
    protected Boolean enLlamada = false;
    protected String tipoFrecuencia = "FM";
}
