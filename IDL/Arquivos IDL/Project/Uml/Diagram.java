package Project.Uml;


/**
* Project/Uml/Diagram.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UML.idl
* Segunda-feira, 22 de Maio de 2017 15H01m BRT
*/

public abstract class Diagram implements org.omg.CORBA.portable.StreamableValue
{
  protected String name = null;

  private static String[] _truncatable_ids = {
    Project.Uml.DiagramHelper.id ()
  };

  public String[] _truncatable_ids() {
    return _truncatable_ids;
  }

  public void _read (org.omg.CORBA.portable.InputStream istream)
  {
    this.name = istream.read_string ();
  }

  public void _write (org.omg.CORBA.portable.OutputStream ostream)
  {
    ostream.write_string (this.name);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Project.Uml.DiagramHelper.type ();
  }
} // class Diagram
