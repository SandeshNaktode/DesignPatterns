package ObserverDesignPattern.NotifyMeFlipkart.Observable;

import ObserverDesignPattern.NotifyMeFlipkart.Observer.NotificationObserver;

public interface StockObservable {
    void registerObserver(NotificationObserver displayObserver);

    void removeObserever(NotificationObserver displayObserver);

    void notifyObserevers();

    void setStock(int stockCount);
    int getStocksCount();
}
