package prep.designpatterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers ;
	private float temp;
	private float humidity;
	private float pressure;
	
	public  WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		 int i = observers.indexOf(o);
		 if(i>=0)
		 {
			 observers.remove(i);
		 }
		
	}

	@Override
	public void notifyObservers() {
		for (int i=0;i<observers.size();i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
		
	}
	
	public void measurementsChangd()
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humid,float pressure)
	{
		this.temp = temp;
		this.humidity = humid;
		this.pressure = pressure;
		measurementsChangd();
	}

	/**
	 * @return the temp
	 */
	public float getTemp() {
		return temp;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

}
