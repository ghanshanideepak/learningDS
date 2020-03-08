package prep.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExtObj implements Externalizable {
	static int age;
	String name;
	int id;
	
   public ExtObj()
   {
	   System.out.println("Default Constructor Object Called");
   }
   
   ExtObj(String n,int i)
      {
	   id=i;
	   name=n;
	   
	   age=10;
	   
   }

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "ExtObj [name=" + name + ", id=" + id + "]";
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	id =in.readInt();
	name = (String) in.readObject();
	age = in.readInt();
	
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	
	out.writeInt(id);
	out.writeObject(name);
	out.writeInt(age);
}
   
   

}
