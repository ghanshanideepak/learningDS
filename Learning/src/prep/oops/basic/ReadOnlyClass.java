package prep.oops.basic;

public class ReadOnlyClass {
	
	private String property1 = "P1";
	/**
	 * @param property2 the property2 to set
	 */
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	private String property2 = "P2";
	private String property3 = "P3";
	/**
	 * @return the property1
	 */
	public String getProperty1() {
		return property1;
	}
	/**
	 * @return the property2
	 */
	public String getProperty2() {
		return property2;
	}
	/**
	 * @return the property3
	 */
	public String getProperty3() {
		return property3;
	}

}
