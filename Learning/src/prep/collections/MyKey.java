package prep.collections;

import java.util.Comparator;

public class MyKey implements Comparable<MyKey> {
	Integer i;
	
	public MyKey(Integer i )
	{
		this.i=i;
	}
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i == null) ? 0 : i.hashCode());
		return result;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		if (i == null) {
			if (other.i != null)
				return false;
		} else if (!i.equals(other.i))
			return false;
		return true;
	}





	@Override
	public int compareTo(MyKey obj0) {
		// TODO Auto-generated method stub
		return this.i.compareTo(obj0.i);
	}
	
	

}
