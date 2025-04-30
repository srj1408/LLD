package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileDisplay = new MobileDisplay();
        Observer webDisplay = new WebDisplay();

        weatherStation.registerObserver(mobileDisplay);
        weatherStation.registerObserver(webDisplay);

        weatherStation.setTemperature(10.2f);

        weatherStation.removeObserver(webDisplay);
        weatherStation.notifyObservers();
    }
}
