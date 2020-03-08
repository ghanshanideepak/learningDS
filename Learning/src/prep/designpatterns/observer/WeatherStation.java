package prep.designpatterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentWeather = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statics = new StatisticsDisplay(weatherData);
		ForecastDisplay forecast = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(82, 28, 4.04f);
		weatherData.setMeasurements(73, 88, 41.04f);
		weatherData.setMeasurements(22, 100, 1.04f);
	}

}
