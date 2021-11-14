/**
* @author: Jimena Hernández & Mark Albrand
* @version: 14-Nov-21
* Esta clase es la encargada de las operaciones.
**/

import radios.*;

public class Controlador {
    
    private static Vista vista = new Vista();
    public static void main(String[] args) {
        int tipoderadio = vista.tipoRadio();

        while(tipoderadio != 4){
            switch(tipoderadio){
                case 1: //clase S
                RadioS radioactualS = new RadioS();
                int menuS= vista.funcionalidadescarroS();
                while(menuS != 14){
                    switch(menuS){
                        case 0: //Enceder o apagar
                        vista.mensaje(radioactualS.encender());
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualS.getEncendido()) {
                            int tipofrecuenciaS= vista.tipoFrecuencia();
                            vista.mensaje(radioactualS.cambiarAMFM(tipofrecuenciaS));                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualS.getEncendido()) {
                            vista.mensaje(radioactualS.cambiarEmisora());                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualS.getEncendido()) {
                            vista.mensaje(radioactualS.guardarEmisora());                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualS.getEncendido()) {
                            double nuevaEmisoraS = vista.elegirEmisora();
                            vista.mensaje(radioactualS.cargarEmisora(nuevaEmisoraS));                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualS.getEncendido()) {
                            int tiposeleccionS= vista.listadeReproduccion();
                            vista.mensaje(radioactualS.seleccionarListaReproduccion(tiposeleccionS));                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualS.getEncendido()) {
                            int tipodecambioS= vista.cambioCancion();
                            vista.mensaje(radioactualS.cambiarCancion(tipodecambioS));                            
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualS.getEncendido()) {                            
                            vista.mensaje(radioactualS.escucharCancion());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualS.getEncendido()) {                            
                            vista.mensaje(radioactualS.conectarTelefono());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualS.getEncendido()) {                            
                            vista.mensaje(radioactualS.getContactos());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualS.getEncendido()) {                            
                            int llamarS= vista.LLamarContacto();
                            vista.mensaje(radioactualS.llamar(llamarS));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualS.getEncendido()) {                            
                            vista.mensaje(radioactualS.finalizarLlamada());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }

                        break;

                        case 12: //Cambiar a bocinas o auriculares
                        if (radioactualS.getEncendido()) {                            
                            int cambioBoaS= vista.Cambiarbocinasaudifonos();
                            vista.mensaje(radioactualS.cambiarBocinasAuriculares(cambioBoaS));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 13: //planificar viajes
                        if (radioactualS.getEncendido()) {                            
                            String viajeS= vista.planificarViaje();
                            vista.mensaje(radioactualS.planificarViaje(viajeS));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;
                        
                    }
                    menuS= vista.funcionalidadescarroS();
                }
                break;

                case 2://clase A
                RadioA radioactualA = new RadioA();
                int menuA= vista.funcionalidadescarroA();
                while(menuA != 14){
                    switch(menuA){
                        case 0: //Enceder o apagar
                        vista.mensaje(radioactualA.encender());
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualA.getEncendido()) {                            
                            int tipofrecuenciaA= vista.tipoFrecuencia();
                            vista.mensaje(radioactualA.cambiarAMFM(tipofrecuenciaA));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.cambiarEmisora());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.guardarEmisora());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualA.getEncendido()) {                            
                            double nuevaEmisoraA = vista.elegirEmisora();
                            vista.mensaje(radioactualA.cargarEmisora(nuevaEmisoraA));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualA.getEncendido()) {                            
                            int tiposeleccionA= vista.listadeReproduccion();
                            vista.mensaje(radioactualA.seleccionarListaReproduccion(tiposeleccionA));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualA.getEncendido()) {                            
                            int tipodecambioA= vista.cambioCancion();
                            vista.mensaje(radioactualA.cambiarCancion(tipodecambioA));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.escucharCancion());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.conectarTelefono());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.getContactos());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualA.getEncendido()) {                            
                            int llamarA= vista.LLamarContacto();
                            vista.mensaje(radioactualA.llamar(llamarA));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.finalizarLlamada());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 12: //Llamar a último contacto
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.llamarUltimoContacto());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 13: //Ver tarjetas presentación
                        if (radioactualA.getEncendido()) {                            
                            vista.mensaje(radioactualA.verTarjetasPresentacion());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;
                        
                    }
                    menuA= vista.funcionalidadescarroA();
                }

                break;

                case 3: //clase C
                RadioC radioactualC = new RadioC();
                int menuC= vista.funcionalidadescarroC();
                while(menuC != 14){
                    switch(menuC){
                        case 0: //Enceder o apagar
                        vista.mensaje(radioactualC.encender());
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualC.getEncendido()) {                            
                            int tipofrecuenciaC= vista.tipoFrecuencia();
                            vista.mensaje(radioactualC.cambiarAMFM(tipofrecuenciaC));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }

                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.cambiarEmisora());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.guardarEmisora());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualC.getEncendido()) {                            
                            double nuevaEmisoraC = vista.elegirEmisora();
                            vista.mensaje(radioactualC.cargarEmisora(nuevaEmisoraC));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualC.getEncendido()) {                            
                            int tiposeleccionC= vista.listadeReproduccion();
                            vista.mensaje(radioactualC.seleccionarListaReproduccion(tiposeleccionC));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualC.getEncendido()) {                            
                            int tipodecambioC= vista.cambioCancion();
                            vista.mensaje(radioactualC.cambiarCancion(tipodecambioC));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.escucharCancion());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.conectarTelefono());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.getContactos());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualC.getEncendido()) {                            
                            int llamarC= vista.LLamarContacto();
                            vista.mensaje(radioactualC.llamar(llamarC));
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.finalizarLlamada());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 12: //Cambiar a llamada en espera
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.llamadaEnEspera());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;

                        case 13: //Pronostico del tiempo
                        if (radioactualC.getEncendido()) {                            
                            vista.mensaje(radioactualC.pronosticoTiempo());
                        }else{
                            vista.mensaje("El radio no se encuentra encendido");
                        }
                        break;
                        
                    }
                    menuC= vista.funcionalidadescarroC();
                }
                
                break; 
                //Se le avisa al usuario que no esta ingresando una opción correcta
               default: vista.mensaje("-Opcion invalida, porfavor ingrese una opción valida-");   break;
            }
            tipoderadio = vista.tipoRadio(); 
        }
        
    }
}
