package sop_corba;


/**
* sop_corba/ControladorNotificacionesIntOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./interface.idl
* martes 9 de agosto de 2022 06:37:45 PM CDT
*/

public interface ControladorNotificacionesIntOperations 
{
  sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO[] listarNotificaciones ();
  boolean registrarNotificacion (sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO objNotificacion);
} // interface ControladorNotificacionesIntOperations
