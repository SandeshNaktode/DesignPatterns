package ObserverDesignPattern.NotifyMeFlipkart.Observable;

import ObserverDesignPattern.NotifyMeFlipkart.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    List<NotificationObserver> notificationObservers = new ArrayList<>();
    int stockCount;

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
        int oldStock= this.stockCount;
        this.stockCount = stockCount;
        if(oldStock == 0){
            notifyObserevers();
        }
    }

    @Override
    public int getStocksCount() {
        return this.stockCount;
    }
}
