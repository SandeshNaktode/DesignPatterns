package AbstractFactoryPattern;

public class AbstractFactoryMain {

    public  static void main(String args []){
        System.out.println("Abstract Factory Design Pattern");
        FactoryProducer factoryProducer = new FactoryProducer();
        VehicleFactory luxury = factoryProducer.getVehicleFactory("Luxury");
        Vehicle bmw = luxury.createVehicle("BMW");
        bmw.getVehicleDetails();

        Vehicle mercedes = luxury.createVehicle("mercedes");
        mercedes.getVehicleDetails();

        VehicleFactory Ordinary = factoryProducer.getVehicleFactory("Ordinary");
        Vehicle hyundai = Ordinary.createVehicle("Hyundai");
        hyundai.getVehicleDetails();

        Vehicle suzuki = Ordinary.createVehicle("Suzuki");
        suzuki.getVehicleDetails();




    }
}
