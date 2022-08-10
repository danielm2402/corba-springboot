package com.mycompany.servidornotificaciones.servicios;



import com.mycompany.servidornotificaciones.Repositorios.NotificacionRepository;
import com.mycompany.servidornotificaciones.controladores.ControladorGestorNotificacionesImpl;


import com.mycompany.servidornotificaciones.utilidades.UtilidadesConsola;
import com.mycompany.servidornotificaciones.utilidades.UtilidadesRegistroS;


public class ServidorDeObjetos {

    public static void main(String[] args) {

        try {
            String[] vectorDatosLocalizarNS = new String[4];//almacena la información para localizar el ns
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vectorDatosLocalizarNS[1] = UtilidadesConsola.leerCadena();
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vectorDatosLocalizarNS[3] = UtilidadesConsola.leerCadena();
            
            NotificacionRepository objRepository = new NotificacionRepository();
            ControladorGestorNotificacionesImpl objRemotoGestionCanciones = new ControladorGestorNotificacionesImpl(objRepository);
      
            UtilidadesRegistroS.registrarObjetoRemoto(vectorDatosLocalizarNS, objRemotoGestionCanciones,"idObjetoRemoto");
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }

    }

}
