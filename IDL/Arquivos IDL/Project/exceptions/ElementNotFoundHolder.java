package Project.exceptions;

/**
* Project/exceptions/ElementNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Exceptions.idl
* Segunda-feira, 22 de Maio de 2017 15H01m BRT
*/

public final class ElementNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public Project.exceptions.ElementNotFound value = null;

  public ElementNotFoundHolder ()
  {
  }

  public ElementNotFoundHolder (Project.exceptions.ElementNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Project.exceptions.ElementNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Project.exceptions.ElementNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Project.exceptions.ElementNotFoundHelper.type ();
  }

}
