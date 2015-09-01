package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, Exception {

	ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.txt")));
	Person p=new Person(1, "lee");
	oos.writeObject(p);
	oos.close();
	 ObjectInputStream objectIn=new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.txt")));
	   p=(Person)objectIn.readObject();
	   objectIn.close();
	   System.out.println("Name:"+p.getName());
	   System.out.println("age:"+p.getAge());
	
	
	
	
	
	
	//	Class<?> cla=null;
//	cla=Class.forName("test.Person");
//	Constructor<?> cons[]=cla.getConstructors();
//	Person per1=null,per2=null,per3=null,per4=null;
//	per1=(Person) cons[0].newInstance(1);
//	//[public test.Person(int), public test.Person(), public test.Person(int,java.lang.String), public test.Person(java.lang.String)]
//	per2=(Person) cons[1].newInstance( );
//	per3=(Person) cons[2].newInstance(14,"小米");
//	per4=(Person) cons[3].newInstance("test");
//	 System.out.println(per1);
//     System.out.println(per2);
//     System.out.println(per3);
//     System.out.println(per4);
//	
	/*System.err.println("        ♥♥♥♥♥♥         ♥♥♥♥♥♥        ");
	System.err.println("     ♥♥♥♥♥♥♥♥♥♥       ♥♥♥♥♥♥♥♥♥♥     ");
	System.err.println("   ♥♥♥♥♥♥♥♥♥♥♥♥♥     ♥♥♥♥♥♥♥♥♥♥♥♥♥   ");
	System.err.println(" ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥   ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ ");
	System.err.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
	System.err.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
	System.err.println("  ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥  ");
	System.err.println("    ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥    ");
	System.err.println("      ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥      ");
	System.err.println("        ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥        ");
	System.err.println("          ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥          ");
	System.err.println("            ♥♥♥♥♥♥♥♥♥♥♥♥♥            ");
	System.err.println("              ♥♥♥♥♥♥♥♥♥              ");
	System.err.println("                ♥♥♥♥♥         		 ");
	System.err.println("                  ♥                  ");
	System.err.println("				  					 ");*/
}
}
