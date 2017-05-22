package Project.Uml;


/**
* Project/Uml/UMLAssociationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UML.idl
* Segunda-feira, 22 de Maio de 2017 15H01m BRT
*/

abstract public class UMLAssociationHelper
{
  private static String  _id = "IDL:Project/Uml/UMLAssociation:1.0";

  public static void insert (org.omg.CORBA.Any a, Project.Uml.UMLAssociation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Project.Uml.UMLAssociation extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "nome",
            _tcOf_members0,
            null);
          _tcOf_members0 = Project.Uml.UMLElementHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "a",
            _tcOf_members0,
            null);
          _tcOf_members0 = Project.Uml.UMLElementHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "b",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (Project.Uml.UMLAssociationHelper.id (), "UMLAssociation", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Project.Uml.UMLAssociation read (org.omg.CORBA.portable.InputStream istream)
  {
    Project.Uml.UMLAssociation value = new Project.Uml.UMLAssociation ();
    value.id = istream.read_string ();
    value.nome = istream.read_string ();
    value.a = Project.Uml.UMLElementHelper.read (istream);
    value.b = Project.Uml.UMLElementHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Project.Uml.UMLAssociation value)
  {
    ostream.write_string (value.id);
    ostream.write_string (value.nome);
    Project.Uml.UMLElementHelper.write (ostream, value.a);
    Project.Uml.UMLElementHelper.write (ostream, value.b);
  }

}
