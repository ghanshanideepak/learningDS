package prep.serialization;

import java.io.Serializable;

import prep.collections.Student;

public class SerializationObject implements Serializable {
	
	public int id;
	public  long version ;
	public Student std;
	public transient String trans;
	public String name ;
	public String city ;
	
	public SerializationObject(int id,long version,String name,String city,Student std,String temp)
	{
		this.id=id;
		this.version=version;
		this.name=name;
		this.city=city;
		this.std=std;
		this.trans=temp;
	}

	
	/**
	 * @return the trans
	 */
	public String getTrans() {
		return trans;
	}


	/**
	 * @param trans the trans to set
	 */
	public void setTrans(String trans) {
		this.trans = trans;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SerializationObject [id=" + id + ", version=" + version + ", std=" + std + ", name=" + name + ", city="
				+ city + "]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	

}
