package ObserverDesignPattern.NotifyMeFlipkart.Observable;

import ObserverDesignPattern.NotifyMeFlipkart.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookObservable implements StockObservable{
    List<NotificationObserver> notificationObservers = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void registerObserver(NotificationObserver displayObserver) {
        notificationObservers.add(displayObserver);
    }

    @Override
    public void removeObserever(NotificationObserver displayObserver) {
        notificationObservers.remove(displayObserver);
    }

    @Override
    public void notifyObserevers() {
        for(NotificationObserver observer : notificationObservers){
            observer.update();
        }
    }

    @Override
    public void setStock(int stockCount) {
        if(this.stockCount == 0){
            notifyObserevers();
        }
        this.stockCount += stockCount;
    }

    @Override
    public int getStocks() {
        return stockCount;
    }
}
