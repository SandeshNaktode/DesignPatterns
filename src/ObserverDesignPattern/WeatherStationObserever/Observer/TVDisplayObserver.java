package ObserverDesignPattern.WeatherStationObserever.Observer;

import ObserverDesignPattern.WeatherStationObserever.Observable.WeatherStationObservable;

public class TVDisplayObserver implements DisplayObserver{
    WeatherStationObservable weatherStationObservable;

    public TVDisplayObserver(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.registerObserver(this);
    }

    @Override
    public void update() {
        int temperature = weatherStationObservable.getTemperature();
        System.out.println("TV Display: Current temperature is " + temperature);
    }
}
