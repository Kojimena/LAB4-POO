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
                        int tipofrecuenciaS= vista.tipoFrecuencia();
                        vista.mensaje(radioactualS.cambiarAMFM(tipofrecuenciaS));

                        break;

                        case 2:// Cambiar emisoras
                        vista.mensaje(radioactualS.cambiarEmisora());
                        break; 

                        case 3://Guardar emisora
                        vista.mensaje(radioactualS.guardarEmisora());
                        break;

                        case 4:// Cargar emisora
                        double nuevaEmisoraS = vista.elegirEmisora();
                        vista.mensaje(radioactualS.cargarEmisora(nuevaEmisoraS));
                        break;

                        case 5://Seleccionar lista de reproducción
                        int tiposeleccionS= vista.listadeReproduccion();
                        vista.mensaje(radioactualS.seleccionarListaReproduccion(tiposeleccionS));
                        break;

                        case 6: //cambiar canción
                        int tipodecambioS= vista.cambioCancion();
                        vista.mensaje(radioactualS.cambiarCancion(tipodecambioS));
                        break;

                        case 7: //escuchar canción
                        vista.mensaje(radioactualS.escucharCancion());
                        break;

                        case 8: //Conectar/desconectar teléfono
                        vista.mensaje(radioactualS.conectarTelefono());
                        break; 

                        case 9:// Mostrar contactos
                        vista.mensaje(radioactualS.getContactos());
                        break;

                        case 10://llamar a contacto
                        int llamarS= vista.LLamarContacto();
                        vista.mensaje(radioactualS.llamar(llamarS));
                        break;

                        case 11://Finalizar llamada
                        vista.mensaje(radioactualS.finalizarLlamada());

                        break;

                        case 12: //Cambiar a bocinas o auriculares
                        int cambioBoaS= vista.Cambiarbocinasaudifonos();
                        vista.mensaje(radioactualS.cambiarBocinasAuriculares(cambioBoaS));
                        break;

                        case 13: //planificar viajes
                        String viajeS= vista.planificarViaje();
                        vista.mensaje(radioactualS.planificarViaje(viajeS));
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
                        int tipofrecuenciaA= vista.tipoFrecuencia();
                        vista.mensaje(radioactualA.cambiarAMFM(tipofrecuenciaA));

                        break;

                        case 2:// Cambiar emisoras
                        vista.mensaje(radioactualA.cambiarEmisora());
                        break; 

                        case 3://Guardar emisora
                        vista.mensaje(radioactualA.guardarEmisora());
                        break;

                        case 4:// Cargar emisora
                        double nuevaEmisoraA = vista.elegirEmisora();
                        vista.mensaje(radioactualA.cargarEmisora(nuevaEmisoraA));
                        break;

                        case 5://Seleccionar lista de reproducción
                        int tiposeleccionA= vista.listadeReproduccion();
                        vista.mensaje(radioactualA.seleccionarListaReproduccion(tiposeleccionA));
                        break;

                        case 6: //cambiar canción
                        int tipodecambioA= vista.cambioCancion();
                        vista.mensaje(radioactualA.cambiarCancion(tipodecambioA));
                        break;

                        case 7: //escuchar canción
                        vista.mensaje(radioactualA.escucharCancion());
                        break;

                        case 8: //Conectar/desconectar teléfono
                        vista.mensaje(radioactualA.conectarTelefono());
                        break; 

                        case 9:// Mostrar contactos
                        vista.mensaje(radioactualA.getContactos());
                        break;

                        case 10://llamar a contacto
                        int llamarA= vista.LLamarContacto();
                        vista.mensaje(radioactualA.llamar(llamarA));
                        break;

                        case 11://Finalizar llamada
                        vista.mensaje(radioactualA.finalizarLlamada());

                        break;

                        case 12: //Llamar a último contacto
                        vista.mensaje(radioactualA.llamarUltimoContacto());
                        break;

                        case 13: //Ver tarjetas presentación
                        vista.mensaje(radioactualA.verTarjetasPresentacion());
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
                        int tipofrecuenciaC= vista.tipoFrecuencia();
                        vista.mensaje(radioactualC.cambiarAMFM(tipofrecuenciaC));

                        break;

                        case 2:// Cambiar emisoras
                        vista.mensaje(radioactualC.cambiarEmisora());
                        break; 

                        case 3://Guardar emisora
                        vista.mensaje(radioactualC.guardarEmisora());
                        break;

                        case 4:// Cargar emisora
                        double nuevaEmisoraC = vista.elegirEmisora();
                        vista.mensaje(radioactualC.cargarEmisora(nuevaEmisoraC));
                        break;

                        case 5://Seleccionar lista de reproducción
                        int tiposeleccionC= vista.listadeReproduccion();
                        vista.mensaje(radioactualC.seleccionarListaReproduccion(tiposeleccionC));
                        break;

                        case 6: //cambiar canción
                        int tipodecambioC= vista.cambioCancion();
                        vista.mensaje(radioactualC.cambiarCancion(tipodecambioC));
                        break;

                        case 7: //escuchar canción
                        vista.mensaje(radioactualC.escucharCancion());
                        break;

                        case 8: //Conectar/desconectar teléfono
                        vista.mensaje(radioactualC.conectarTelefono());
                        break; 

                        case 9:// Mostrar contactos
                        vista.mensaje(radioactualC.getContactos());
                        break;

                        case 10://llamar a contacto
                        int llamarC= vista.LLamarContacto();
                        vista.mensaje(radioactualC.llamar(llamarC));
                        break;

                        case 11://Finalizar llamada
                        vista.mensaje(radioactualC.finalizarLlamada());

                        break;

                        case 12: //Cambiar a llamada en espera
                        vista.mensaje(radioactualC.llamadaEnEspera());
                        break;

                        case 13: //Pronostico del tiempo
                        vista.mensaje(radioactualC.pronosticoTiempo());
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
