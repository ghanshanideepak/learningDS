package prep.designpatterns.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public  CurrentConditionDisplay(Subject sub) {
		 this.weatherData=sub;
		 weatherData.registerObserver(this);
		
		
	}
	@Override
	public void display() {
		System.out.println("Current Temperature : " + temperature + " and  humidity  " + humidity + "%");
		
	}

	@Override
	public void update(float temp, float humidity, float presssure) {
		this.temperature = temp;
		this.humidity=humidity;
		display();
		
	}

}
