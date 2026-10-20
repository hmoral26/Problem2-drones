// Concrete factory for Manufacturer B
// B focuses on battery, so the mAh numbers are higher here



public class ManufacturerBFactory implements DroneFactory {

    // returns the name of this manufacturer
    public String getMakerName() {
        return "Manufacturer B";
    }

    // Abstract Factory is used here: B builds its own version of the same three drones
    public SurveillanceDrone createSurveillance() {
        return new SurveillanceDrone(4500, 35, "standard camera");
    }

    // B builds its own delivery drone
    public DeliveryDrone createDelivery() {
        return new DeliveryDrone(5000, 40, "high payload");
    }

    // B builds its own agricultural drone
    public AgriculturalDrone createAgricultural() {
        return new AgriculturalDrone(6000, 30, "irrigation tank");
    }


}
