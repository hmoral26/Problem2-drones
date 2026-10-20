// Abstract Factory. One factory makes the whole family of drones
// The test uses this interface, not ManufacturerA or ManufacturerB by name


public interface DroneFactory {

    // makes that factory's surveillance drone
    SurveillanceDrone createSurveillance();

    // makes that factory's delivery drone
    DeliveryDrone createDelivery();

    // makes that factory's agricultural drone
    AgriculturalDrone createAgricultural();

    // name printed in the test
    String getMakerName();

}

