package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private float temperature;
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList) observer.update(temperature);
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
