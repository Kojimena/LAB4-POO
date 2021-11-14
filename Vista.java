/**
* @author:  Mark Albrand & Jimena Hernández 
* @version: 13-Nov-21
* @file: Vista.java
* Esta clase es la vista del programa.Imprime resultados y pide datos.
**/

//imports
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Vista {

    private Scanner scan = new Scanner(System.in);
    /**
    * @param: String
    * imprime texto
    **/ 
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mensaje(String[][] mensaje){
        for (int i = 0; i < mensaje.length; i++) {
            String[] contacto = mensaje[i];
            String mensajeContacto = "Nombre: " + contacto[0] + " Numero: " + contacto[1];
            mensaje(mensajeContacto);
        }
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int funcionalidadescarroS(){
        int opcion = 0;
        boolean ingresoCorrecto= false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿Qué desea hacer?");
            mensaje("0. Boton de Encendido/Apagado");
            mensaje("\n MODO RADIO ");
            mensaje("1. Cambiar de FM a AM");
            mensaje("2. Cambiar emisoras, se cambiará en intervalos de 0.5");
            mensaje("3. Guardar emisoras");
            mensaje("4. Cargar emisora");
            mensaje("\n MODO REPRODUCCIÓN ");
            mensaje("5. Seleccionar lista de reproducción ");
            mensaje("6. Cambiar canción");
            mensaje("7. Escuchar canción");
            mensaje("\n MODO TELEFONO ");
            mensaje("8. Conectar/desconectar teléfono");
            mensaje("9. Mostrar Contactos");
            mensaje("10. LLamar a contacto");
            mensaje("11. Finalizar llamada ");
            mensaje("12. Cambiar a bocinas o auriculares");
            mensaje("\n MODO PRODUCTIVIDAD ");
            mensaje("13. Planificar Viajes");
            mensaje("14. Salir");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if(opcion > 14 | opcion < 0){
                    throw new InputMismatchException();
                }else{
                    ingresoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);        
            }            
        }    
        scan.nextLine();
        return opcion;
    }

        /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int funcionalidadescarroC(){
        int opcion = 0;
        boolean ingresoCorrecto= false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿Qué desea hacer?");
            mensaje("0. Boton de Encendido/Apagado");
            mensaje("\n MODO RADIO ");
            mensaje("1. Cambiar de FM a AM");
            mensaje("2. Cambiar emisoras, se cambiará en intervalos de 0.5");
            mensaje("3. Guardar emisoras");
            mensaje("4. Cargar emisora");
            mensaje("\n MODO REPRODUCCIÓN ");
            mensaje("5. Seleccionar lista de reproducción ");
            mensaje("6. Cambiar canción");
            mensaje("7. Escuchar canción");
            mensaje("\n MODO TELEFONO ");
            mensaje("8. Conectar/desconectar teléfono");
            mensaje("9. Mostrar Contactos");
            mensaje("10. LLamar a contacto");
            mensaje("11. Finalizar llamada ");
            mensaje("12. Cambiar a llamada en espera");
            mensaje("\n MODO PRODUCTIVIDAD ");
            mensaje("13. Ver pronostico del tiempo");
            mensaje("14. Salir");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if(opcion > 14 | opcion < 0){
                    throw new InputMismatchException();
                }else{
                    ingresoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);        
            }             
        }
    
        scan.nextLine();
        return opcion;
    }

        /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int funcionalidadescarroA(){
        int opcion = 0;
        boolean ingresoCorrecto= false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿Qué desea hacer?");
            mensaje("0. Boton de Encendido/Apagado");
            mensaje("\n MODO RADIO ");
            mensaje("1. Cambiar de FM a AM");
            mensaje("2. Cambiar emisoras, se cambiará en intervalos de 0.5");
            mensaje("3. Guardar emisoras");
            mensaje("4. Cargar emisora");
            mensaje("\n MODO REPRODUCCIÓN ");
            mensaje("5. Seleccionar lista de reproducción ");
            mensaje("6. Cambiar canción");
            mensaje("7. Escuchar canción");
            mensaje("\n MODO TELEFONO ");
            mensaje("8. Conectar/desconectar teléfono");
            mensaje("9. Mostrar Contactos");
            mensaje("10. LLamar a contacto");
            mensaje("11. Finalizar llamada ");
            mensaje("12. Llamar a último contacto");
            mensaje("\n MODO PRODUCTIVIDAD ");
            mensaje("13. Ver tarjetas presentación");
            mensaje("14. Salir");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if(opcion > 14 | opcion < 0){
                    throw new InputMismatchException();
                }else{
                    ingresoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);        
            }          
        }
    
        scan.nextLine();
        return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int tipoRadio(){
        int opcion = 0;
        boolean ingresoCorrecto = false;

        while(ingresoCorrecto != true){
            mensaje("\n" +"¿Qué tipo de radio desea");
            mensaje("1. Radio de un vehículo clase S");
            mensaje("2. Radio de un vehículo clase A");
            mensaje("3. Radio de un vehículo clase C");
            mensaje("4. Salir");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion < 1 | opcion > 4) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }
            
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);
            }
        }
    
        scan.nextLine();
        return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int tipoFrecuencia(){
        int opcion = 0;
        boolean ingresoCorrecto= false;

        while (ingresoCorrecto != false) {
            mensaje("\n" +"¿Qué tipo de frecuencia desea");
            mensaje("1. FM");
            mensaje("2. AM");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion>2 | opcion <1) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }
            
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);
            
            }
            
        }

    
    scan.nextLine();
    return opcion;
    }



    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int listadeReproduccion(){
        int opcion = 0;
        boolean ingresoCorrecto = false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿Qué tipo de playlist desea");
            mensaje("1. Lofi-Chill");
            mensaje("2. Top 5 Guatemala");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion < 1 | opcion > 2) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }            
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);            
            }            
        }    
        scan.nextLine();
        return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int cambioCancion(){
        int opcion = 0;
        boolean ingresoCorrecto = false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿Qué desea reproducir?");
            mensaje("1. Siguiente canción");
            mensaje("2. Canción anterior");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion < 1 | opcion > 2) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }
            
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);            
            }            
        }    
        scan.nextLine();
        return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int LLamarContacto(){
        int opcion = 0;
        boolean ingresoCorrecto = false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿A quién desea llamar ");
            mensaje("1. Olivia Rodrigo");
            mensaje("2. Stephen Smitz");
            mensaje("3. Pepe Juarez");
            mensaje("4. Mark Albrand");
            mensaje("5. Jimena Hernández");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion < 1 | opcion > 5) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);            
            }            
        }
        scan.nextLine();
        return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    * @throws InputMismatchException
    */
    public int Cambiarbocinasaudifonos(){
        int opcion = 0;
        boolean ingresoCorrecto = false;

        while (ingresoCorrecto != true) {
            mensaje("\n" +"¿ A qué desea cambiar? ");
            mensaje("1. Cambiar a bocinas");
            mensaje("2. Cambiar a audifonos");
            mensaje("Seleccion: ");
            try {
                opcion = scan.nextInt();
                if (opcion < 1 | opcion > 2) {
                    throw new ArithmeticException();
                }else{
                    ingresoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);            
            }            
        }
        scan.nextLine();
        return opcion;
    }

    /**
    * @return localización viaje a planificar
    */
    public String planificarViaje(){
        
        System.out.printf("\nIngrese el nombre de la localización del viaje que desea planificar");

        String location = scan.nextLine();

        return location;
    }

    public double elegirEmisora(){
        double opcion = 0.0;
        boolean ingresoCorrecto = false;

        while (ingresoCorrecto != true) {
            mensaje("Ingrese la emisora que desea escuchar:");
            try {
                opcion = scan.nextDouble();
                if(opcion<87.5 | opcion > 108.0){
                    throw new InputMismatchException("Ingrese una emisora válida");
                }else{
                    ingresoCorrecto = true;
                }
            
            } catch (InputMismatchException e) {
                mensaje("La opción elegida no es valida. Porfavor, ingrese una opción válida");
                scan = new Scanner(System.in);                            
            }            
        }

    
        scan.nextLine();
        return opcion;
    }

}
