package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AirConditioner ac = new AirConditioner();
        ac.setTemprature(17);
        ac.turnOffAC();

        MyRemoteController remoteController = new MyRemoteController();

        remoteController.setCommand(new TurnACOnCommand(ac));
        remoteController.pressButton();
    }
}