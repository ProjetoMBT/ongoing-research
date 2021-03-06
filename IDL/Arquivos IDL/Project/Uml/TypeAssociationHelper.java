package Project.Uml;


/**
* Project/Uml/TypeAssociationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UML.idl
* Segunda-feira, 22 de Maio de 2017 15H01m BRT
*/

abstract public class TypeAssociationHelper
{
  private static String  _id = "IDL:Project/Uml/TypeAssociation:1.0";

  public static void insert (org.omg.CORBA.Any a, Project.Uml.TypeAssociation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Project.Uml.TypeAssociation extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (Project.Uml.TypeAssociationHelper.id (), "TypeAssociation", new String[] { "include", "extend", "generalization"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Project.Uml.TypeAssociation read (org.omg.CORBA.portable.InputStream istream)
  {
    return Project.Uml.TypeAssociation.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Project.Uml.TypeAssociation value)
  {
    ostream.write_long (value.value ());
  }

}
