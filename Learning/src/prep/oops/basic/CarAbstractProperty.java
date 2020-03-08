package prep.oops.basic;

public abstract class CarAbstractProperty {
	
	public abstract String steeringcolor();
	public abstract String carColor();
	public abstract String carModel();
	public abstract String gearType();
	public abstract boolean isAuthorized();
	
	public void allowTemporaryAccess()
	{
		System.out.println("Allowed access temporary");
	}

}
