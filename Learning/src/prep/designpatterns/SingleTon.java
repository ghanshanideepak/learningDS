package prep.designpatterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTon implements Cloneable {
	
	private static SingleTon singleins = null;
	
	private SingleTon()
	{
		System.out.println("COnstructor Called ...");
	}
	
	public static SingleTon getIns()
	{
		if(singleins==null)
		{
			singleins = new SingleTon();
		}
		return singleins;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class TestSingleTon
{
	
	static void getSingleTon()
	{
		SingleTon singleTon = SingleTon.getIns();
		System.out.println("Object " +  singleTon );
	}
	public static void main(String args[]) throws Exception
	{
		/*SingleTon s1 = SingleTon.getIns();
		SingleTon s2 = SingleTon.getIns();
*/		
		/*System.out.println("Object" + s1);
		System.out.println("Object" + s2);
		*/
		
		
		//Violating SingleTon through Reflection
		/*Class c1 = Class.forName("prep.designpatterns.SingleTon");	
		Constructor<SingleTon> cont = c1.getDeclaredConstructor();
		cont.setAccessible(true);
		SingleTon s3 = cont.newInstance();

		System.out.println("ReflectionObject" + s3 );*/
		
		//Violating SingleTon through Serialization
		/*ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream(new File("s2.ser")));
		objout.writeObject(s2);
		
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream(new File("s2.ser")));
		SingleTon s3 = (SingleTon)objin.readObject();
		
		System.out.println("Serilized object construction  " + s3);*/
		
		
		// In order to violate it through clone method we need to implements Colenable inteface and over ride
		/*SingleTon s3 = (SingleTon) s2.clone();
		
		System.out.println("Clone object of s2" + s3	);*/
		
		
		// Multithreaded Environment
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(TestSingleTon :: getSingleTon);
		exec.submit(TestSingleTon :: getSingleTon);
		
		exec.shutdown();
		
	}
	}
