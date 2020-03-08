package prep.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import prep.collections.Student;

public class SerilalizationExample {
	
	public static  void printData(SerializationObject serObj)
	{
		System.out.println("Id --> " + serObj.id);
		System.out.println("Name --> " + serObj.name);
		System.out.println("Version --> " + serObj.version);
		System.out.println("City --> " + serObj.city);
		System.out.println("Student --> " + serObj.std);
		System.out.println("Transiednt --> " + serObj.getTrans());
		
	}

	
	
	
	
	public static void main(String[] args) {
		
		
		//Serialization Start'
		Student std = new Student(10, "Sudent1", "Cricket");
		SerializationObject serObj = new SerializationObject(10, (long) 0.2, "Deepak", "Delhi",std,"Transient");
		File fileInput = new File("Serialize.txt");
		try {
			FileOutputStream fileOut = new FileOutputStream(fileInput);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(serObj);
			objOut.close();
			fileOut.close();
			} 
			catch (FileNotFoundException e) {			
			e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				}
		
		 serObj.setName("Rahul");
		 std.setHobby("Chess");
		 serObj.setTrans("Changed");
		//Serialization End
		
		serObj = null;
		
		//Deserialization Start
		try {
			FileInputStream fileObj = new FileInputStream("Serialize.txt");
			ObjectInputStream objInput = new ObjectInputStream(fileObj);
			serObj = (SerializationObject)objInput.readObject();
			
			fileObj.close();
			objInput.close();
			printData(serObj);
			
			
			} 
			catch (FileNotFoundException e) {			
			e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
