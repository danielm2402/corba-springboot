package sop_corba;

/**
* sop_corba/ControladorNotificacionesIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./interface.idl
* martes 9 de agosto de 2022 06:37:45 PM CDT
*/

public final class ControladorNotificacionesIntHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.ControladorNotificacionesInt value = null;

  public ControladorNotificacionesIntHolder ()
  {
  }

  public ControladorNotificacionesIntHolder (sop_corba.ControladorNotificacionesInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.ControladorNotificacionesIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.ControladorNotificacionesIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.ControladorNotificacionesIntHelper.type ();
  }

}
