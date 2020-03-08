package prep.oops.basic;

public class CarMainApp {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		//VisitingTemporaryCar tempCar  = new VisitingTemporaryCar();
		
		Porsche porsche = new Porsche();
		porsche.allowTemporaryAccess();
		
		

	}

}
