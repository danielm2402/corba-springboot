package com.mycompany.servidornotificaciones.Repositorios;

import java.util.ArrayList;
import java.util.List;

import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;

public class NotificacionRepository implements NotificacionRepositoryInt
{  
    private final ArrayList<NotificacionDTO> listaNotificaciones;
    
    public NotificacionRepository()
    {
        this.listaNotificaciones= new ArrayList();
    }
    @Override
    public boolean registrarNotificacion(NotificacionDTO objNotificacion) {
        boolean bandera;        
        bandera= this.listaNotificaciones.add(objNotificacion);    
        return bandera;
       
    }

    @Override
    public List<NotificacionDTO> listarNotificaciones() {
        return this.listaNotificaciones;
       
    }
       
}
