package sop_corba.ControladorNotificacionesIntPackage;


/**
* sop_corba/ControladorNotificacionesIntPackage/ListaNotificacionesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./interface.idl
* martes 9 de agosto de 2022 06:37:45 PM CDT
*/

public final class ListaNotificacionesHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO value[] = null;

  public ListaNotificacionesHolder ()
  {
  }

  public ListaNotificacionesHolder (sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.ControladorNotificacionesIntPackage.ListaNotificacionesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.ControladorNotificacionesIntPackage.ListaNotificacionesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.ControladorNotificacionesIntPackage.ListaNotificacionesHelper.type ();
  }

}