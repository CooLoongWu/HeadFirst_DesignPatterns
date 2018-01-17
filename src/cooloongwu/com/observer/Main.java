package cooloongwu.com.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(11, 22, 33);
        weatherData.setMeasurements(22, 33, 44);
    }
}
