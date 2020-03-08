package prep.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationExample {
	
	public static  void printData(ExtObj serObj)
	{
		System.out.println("Id --> " + serObj.id);
		System.out.println("Name --> " + serObj.name);
		System.out.println("Name --> " + serObj.age);
		
		
	}

	public static void main(String[] args) {
		ExtObj ext = new ExtObj("Deepak", 3);
		ExtObj extnew = null;
		
		
		//Externalizing Object Start
		try {
			FileOutputStream fileOut = new FileOutputStream(new File("Extern.txt"));
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(ext);
			objOut.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FileInputStream fileInput;
		try {
			fileInput = new FileInputStream("Extern.txt");
			ObjectInputStream objInput = new ObjectInputStream(fileInput);
			extnew = (ExtObj) objInput.readObject();
			printData(extnew);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
