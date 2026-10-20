// Concrete factory for Manufacturer A


// A focuses on longer range, so the range numbers are higher here


public class ManufacturerAFactory implements DroneFactory {
    // returns the name of this manufacturer
    public String getMakerName() {
        return "Manufacturer A";
    }

    // Abstract Factory is used here: A builds its own surveillance drone
    public SurveillanceDrone createSurveillance() {
        return new SurveillanceDrone(4000, 50, "high-quality camera");
    }

    // A builds its own delivery drone
    public DeliveryDrone createDelivery() {
        return new DeliveryDrone(3500, 60, "medium payload");
    }

    // A builds its own agricultural drone
    public AgriculturalDrone createAgricultural() {
        return new AgriculturalDrone(4500, 45, "crop spraying");
    }


}


