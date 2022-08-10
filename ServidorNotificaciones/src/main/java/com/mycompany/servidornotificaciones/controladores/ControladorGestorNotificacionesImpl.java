package com.mycompany.servidornotificaciones.controladores;

import java.rmi.RemoteException;
import com.mycompany.servidornotificaciones.Repositorios.NotificacionRepositoryInt;


import sop_corba.ControladorNotificacionesIntPOA;
import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;


public class ControladorGestorNotificacionesImpl extends ControladorNotificacionesIntPOA {

    private final NotificacionRepositoryInt objNotificacionRepository;


    public ControladorGestorNotificacionesImpl(NotificacionRepositoryInt objRepository) throws RemoteException {
        this.objNotificacionRepository = objRepository;
    }

    
    @Override
    public NotificacionDTO[] listarNotificaciones() {
       
        return null;

    }
        

    @Override
    public boolean registrarNotificacion(NotificacionDTO objNotificacion) {
         boolean bandera = false;
        if (this.objNotificacionRepository.registrarNotificacion(objNotificacion)) {
            System.out.println("NOTIFICACIÓN REGISTRADA");
            bandera = true;
        }
        return bandera;
    }

}
