package com.mycompany.servidornotificaciones.Repositorios;

import java.util.List;

import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;

public interface NotificacionRepositoryInt
{    
    public boolean registrarNotificacion(NotificacionDTO objNotificacion);   
    public List<NotificacionDTO> listarNotificaciones();
}


