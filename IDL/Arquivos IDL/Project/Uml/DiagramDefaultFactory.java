package Project.Uml;


/**
* Project/Uml/DiagramDefaultFactory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UML.idl
* Segunda-feira, 22 de Maio de 2017 15H01m BRT
*/

public class DiagramDefaultFactory implements org.omg.CORBA.portable.ValueFactory {

  public java.io.Serializable read_value (org.omg.CORBA_2_3.portable.InputStream is)
  {
    return is.read_value(new DiagramImpl ());
  }
}
