package ObserverDesignPattern.WeatherStationObserever;

import ObserverDesignPattern.WeatherStationObserever.Observable.WeatherStationImpl;
import ObserverDesignPattern.WeatherStationObserever.Observable.WeatherStationObservable;
import ObserverDesignPattern.WeatherStationObserever.Observer.MobileDisplayObserver;
import ObserverDesignPattern.WeatherStationObserever.Observer.TVDisplayObserver;

public class MainClassWeatherObserver {
    public static void main(String[] args) {
        WeatherStationObservable weatherStation = new WeatherStationImpl();

        TVDisplayObserver tvDisplay = new TVDisplayObserver(weatherStation);
        MobileDisplayObserver mobileDisplay = new MobileDisplayObserver(weatherStation);

        weatherStation.setTemperature(10);
        System.out.println(" ------GAP----- ");
        weatherStation.setTemperature(20);
        System.out.println(" ------GAP----- ");
        weatherStation.setTemperature(30);
        System.out.println(" ------GAP----- ");
        weatherStation.setTemperature(40);
    }
}
