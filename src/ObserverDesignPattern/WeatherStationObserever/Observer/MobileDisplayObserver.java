package ObserverDesignPattern.WeatherStationObserever.Observer;

import ObserverDesignPattern.WeatherStationObserever.Observable.WeatherStationObservable;

public class MobileDisplayObserver implements DisplayObserver{

    WeatherStationObservable weatherStationObservable;

    public MobileDisplayObserver(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.registerObserver(this);
    }

    @Override
    public void update() {
        int temperature = weatherStationObservable.getTemperature();
        System.out.println("Mobile Display: Current temperature is " + temperature);
    }
}
