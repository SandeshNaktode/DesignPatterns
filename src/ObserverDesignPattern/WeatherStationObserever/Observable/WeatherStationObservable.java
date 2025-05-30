package ObserverDesignPattern.WeatherStationObserever.Observable;

import ObserverDesignPattern.WeatherStationObserever.Observer.DisplayObserver;

public interface WeatherStationObservable {

    void registerObserver(DisplayObserver displayObserver);

    void removeObserever(DisplayObserver displayObserver);

    void notifyObserevers();

    void setTemperature(int temp);
    int getTemperature();
}
