package ObserverDesignPattern.NotifyMeFlipkart;

import ObserverDesignPattern.NotifyMeFlipkart.Observable.IphoneObservable;
import ObserverDesignPattern.NotifyMeFlipkart.Observable.MacBookObservable;
import ObserverDesignPattern.NotifyMeFlipkart.Observable.StockObservable;
import ObserverDesignPattern.NotifyMeFlipkart.Observer.EmailAlertObserver;
import ObserverDesignPattern.NotifyMeFlipkart.Observer.NotificationObserver;
import ObserverDesignPattern.NotifyMeFlipkart.Observer.SMSAlertObserver;

public class StoreMain {
    public static void main(String[] args) {
        StockObservable macStockObservable = new MacBookObservable();
        StockObservable iphoneStockObserver = new IphoneObservable();

        NotificationObserver macObserver1 = new EmailAlertObserver("SandeshMac@gmail.com", macStockObservable);
        NotificationObserver macObserver2 = new SMSAlertObserver("8767876787", macStockObservable);

        NotificationObserver iphoneObserver1 = new EmailAlertObserver("SandeshIphone@gmail.com", iphoneStockObserver);
        NotificationObserver iphoneObserver2 = new SMSAlertObserver("8767876787", iphoneStockObserver);

        macStockObservable.registerObserver(macObserver1);
        macStockObservable.registerObserver(macObserver2);

        iphoneStockObserver.registerObserver(iphoneObserver1);
        iphoneStockObserver.registerObserver(iphoneObserver2);

        iphoneStockObserver.setStock(10);
        macStockObservable.setStock(8);

        iphoneStockObserver.setStock(0);
        macStockObservable.setStock(0);

        iphoneStockObserver.setStock(20);
        macStockObservable.setStock(18);
    }
}
