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
                while(menuS != 15){
                    switch(menuS){
                        case 0: //Enceder o apagar
                        vista.separador();
                        vista.mensaje(radioactualS.encender());
                        vista.separador();
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualS.getEncendido()) {
                            int tipofrecuenciaS= vista.tipoFrecuencia();
                            vista.separador();
                            vista.mensaje(radioactualS.cambiarAMFM(tipofrecuenciaS));
                            vista.separador();                            
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualS.getEncendido()) {
                            vista.separador();
                            vista.mensaje(radioactualS.cambiarEmisora()); 
                            vista.separador();                           
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualS.getEncendido()) {
                            vista.separador();
                            vista.mensaje(radioactualS.guardarEmisora());  
                            vista.separador();                          
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualS.getEncendido()) {
                            double nuevaEmisoraS = vista.elegirEmisora();
                            vista.separador();
                            vista.mensaje(radioactualS.cargarEmisora(nuevaEmisoraS));    
                            vista.separador();                        
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualS.getEncendido()) {
                            int tiposeleccionS= vista.listadeReproduccion();
                            vista.separador();
                            vista.mensaje(radioactualS.seleccionarListaReproduccion(tiposeleccionS));      
                            vista.separador();                      
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualS.getEncendido()) {
                            int tipodecambioS= vista.cambioCancion();
                            vista.separador();
                            vista.mensaje(radioactualS.cambiarCancion(tipodecambioS));
                            vista.separador();                           
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualS.getEncendido()) {  
                            vista.separador();                          
                            vista.mensaje(radioactualS.escucharCancion());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualS.getEncendido()) {            
                            vista.separador();                
                            vista.mensaje(radioactualS.conectarTelefono());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualS.getEncendido()) {      
                            vista.separador();                      
                            vista.mensaje(radioactualS.getContactos());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualS.getEncendido()) {                            
                            int llamarS= vista.LLamarContacto();
                            vista.separador();
                            vista.mensaje(radioactualS.llamar(llamarS));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualS.getEncendido()) {  
                            vista.separador();                          
                            vista.mensaje(radioactualS.finalizarLlamada());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }

                        break;

                        case 12: //Cambiar a bocinas o auriculares
                        if (radioactualS.getEncendido()) {                            
                            int cambioBoaS= vista.Cambiarbocinasaudifonos();
                            vista.separador();
                            vista.mensaje(radioactualS.cambiarBocinasAuriculares(cambioBoaS));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 13: //planificar viajes
                        if (radioactualS.getEncendido()) {                            
                            String viajeS= vista.planificarViaje();
                            vista.separador();
                            vista.mensaje(radioactualS.planificarViaje(viajeS));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 14:
                        if (radioactualS.getEncendido()) {
                            vista.mensaje(radioactualS.toString());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        
                    }
                    menuS= vista.funcionalidadescarroS();
                }
                break;

                case 2://clase A
                RadioA radioactualA = new RadioA();
                int menuA= vista.funcionalidadescarroA();
                while(menuA != 15){
                    switch(menuA){
                        case 0: //Enceder o apagar
                        vista.separador();
                        vista.mensaje(radioactualA.encender());
                        vista.separador();
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualA.getEncendido()) {                            
                            int tipofrecuenciaA= vista.tipoFrecuencia();
                            vista.separador();
                            vista.mensaje(radioactualA.cambiarAMFM(tipofrecuenciaA));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualA.getEncendido()) {               
                            vista.separador();             
                            vista.mensaje(radioactualA.cambiarEmisora());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualA.getEncendido()) {         
                            vista.separador();                   
                            vista.mensaje(radioactualA.guardarEmisora());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualA.getEncendido()) {                            
                            double nuevaEmisoraA = vista.elegirEmisora();
                            vista.separador();
                            vista.mensaje(radioactualA.cargarEmisora(nuevaEmisoraA));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualA.getEncendido()) {                            
                            int tiposeleccionA= vista.listadeReproduccion();
                            vista.separador();
                            vista.mensaje(radioactualA.seleccionarListaReproduccion(tiposeleccionA));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualA.getEncendido()) {                            
                            int tipodecambioA= vista.cambioCancion();
                            vista.separador();
                            vista.mensaje(radioactualA.cambiarCancion(tipodecambioA));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualA.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualA.escucharCancion());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualA.getEncendido()) { 
                            vista.separador();                           
                            vista.mensaje(radioactualA.conectarTelefono());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualA.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualA.getContactos());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualA.getEncendido()) {                            
                            int llamarA= vista.LLamarContacto();
                            vista.separador();
                            vista.mensaje(radioactualA.llamar(llamarA));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualA.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualA.finalizarLlamada());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 12: //Llamar a último contacto
                        if (radioactualA.getEncendido()) {      
                            vista.separador();                      
                            vista.mensaje(radioactualA.llamarUltimoContacto());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 13: //Ver tarjetas presentación
                        if (radioactualA.getEncendido()) {  
                            vista.separador();                          
                            vista.mensaje(radioactualA.verTarjetasPresentacion());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 14:
                        if (radioactualA.getEncendido()) {
                            vista.mensaje(radioactualA.toString());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        
                    }
                    menuA= vista.funcionalidadescarroA();
                }

                break;

                case 3: //clase C
                RadioC radioactualC = new RadioC();
                int menuC= vista.funcionalidadescarroC();
                while(menuC != 15){
                    switch(menuC){
                        case 0: //Enceder o apagar
                        vista.separador();
                        vista.mensaje(radioactualC.encender());
                        vista.separador();
                        break;

                        case 1://cambiar AM A FM
                        if (radioactualC.getEncendido()) {                            
                            int tipofrecuenciaC= vista.tipoFrecuencia();
                            vista.separador();
                            vista.mensaje(radioactualC.cambiarAMFM(tipofrecuenciaC));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }

                        break;

                        case 2:// Cambiar emisoras
                        if (radioactualC.getEncendido()) {    
                            vista.separador();                        
                            vista.mensaje(radioactualC.cambiarEmisora());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 3://Guardar emisora
                        if (radioactualC.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualC.guardarEmisora());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 4:// Cargar emisora
                        if (radioactualC.getEncendido()) {                            
                            double nuevaEmisoraC = vista.elegirEmisora();
                            vista.separador();
                            vista.mensaje(radioactualC.cargarEmisora(nuevaEmisoraC));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 5://Seleccionar lista de reproducción
                        if (radioactualC.getEncendido()) {                            
                            int tiposeleccionC= vista.listadeReproduccion();
                            vista.separador();
                            vista.mensaje(radioactualC.seleccionarListaReproduccion(tiposeleccionC));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 6: //cambiar canción
                        if (radioactualC.getEncendido()) {                            
                            int tipodecambioC= vista.cambioCancion();
                            vista.separador();
                            vista.mensaje(radioactualC.cambiarCancion(tipodecambioC));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 7: //escuchar canción
                        if (radioactualC.getEncendido()) {    
                            vista.separador();                        
                            vista.mensaje(radioactualC.escucharCancion());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 8: //Conectar/desconectar teléfono
                        if (radioactualC.getEncendido()) {        
                            vista.separador();                    
                            vista.mensaje(radioactualC.conectarTelefono());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break; 

                        case 9:// Mostrar contactos
                        if (radioactualC.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualC.getContactos());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 10://llamar a contacto
                        if (radioactualC.getEncendido()) {                            
                            int llamarC= vista.LLamarContacto();
                            vista.separador();
                            vista.mensaje(radioactualC.llamar(llamarC));
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 11://Finalizar llamada
                        if (radioactualC.getEncendido()) {      
                            vista.separador();                      
                            vista.mensaje(radioactualC.finalizarLlamada());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 12: //Cambiar a llamada en espera
                        if (radioactualC.getEncendido()) {      
                            vista.separador();                      
                            vista.mensaje(radioactualC.llamadaEnEspera());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 13: //Pronostico del tiempo
                        if (radioactualC.getEncendido()) {   
                            vista.separador();                         
                            vista.mensaje(radioactualC.pronosticoTiempo());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        break;

                        case 14:
                        if (radioactualC.getEncendido()) {
                            
                            vista.mensaje(radioactualC.toString());
                            vista.separador();
                        }else{
                            vista.separador();
                            vista.mensaje("El radio no se encuentra encendido");
                            vista.separador();
                        }
                        
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
