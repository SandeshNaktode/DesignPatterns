public class AirConditioner {
    boolean isOn;
    int temprature;

    public boolean isACOn() {
        return isOn;
    }

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
        System.out.println("Temperature is Changed to: " +temprature);
    }
}
