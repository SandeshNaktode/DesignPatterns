package ObserverDesignPattern.NotifyMeFlipkart.Observer;

import ObserverDesignPattern.NotifyMeFlipkart.Observable.StockObservable;

public class SMSAlertObserver implements NotificationObserver {
    String mobileNum;
    StockObservable stockObservable;

    public SMSAlertObserver(String mobileNum, StockObservable stockObservable) {
        this.mobileNum = mobileNum;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("SENDING MESSAGE to Mobile Number: "+mobileNum + "---" + stockObservable.getClass().getName());
    }
}
