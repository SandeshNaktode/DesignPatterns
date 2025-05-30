package ObserverDesignPattern.WeatherStationObserever.Observable;

import ObserverDesignPattern.WeatherStationObserever.Observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStationObservable{

    List<DisplayObserver> observerList;
    int temp;

    public WeatherStationImpl() {
        this.observerList = new ArrayList<>();
        this.temp = 27;
    }

    @Override
    public void registerObserver(DisplayObserver displayObserver) {
        observerList.add(displayObserver);
    }

    @Override
    public void removeObserever(DisplayObserver displayObserver) {
        observerList.remove(displayObserver);
    }

    @Override
    public void notifyObserevers() {
        for (DisplayObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setTemperature(int temp) {
        this.temp = temp;
        notifyObserevers();
    }

    @Override
    public int getTemperature() {
        return temp;
    }
}
