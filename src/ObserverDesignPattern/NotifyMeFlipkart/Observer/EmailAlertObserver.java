package ObserverDesignPattern.NotifyMeFlipkart.Observer;

import ObserverDesignPattern.NotifyMeFlipkart.Observable.StockObservable;

public class EmailAlertObserver implements NotificationObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {

        System.out.println("SENDING EMAIL to EMAILID: "+emailId +"---" + stockObservable.getClass().getName());
    }
}
