// This class tests the drone factories.
// It prints one drone at a time.
public class DroneTest {

    // This method prints one drone from the factory you give it.
    // type can be "surveillance", "delivery", or "agricultural".
    public static void printOne(DroneFactory factory, String type) {
        System.out.println(factory.getMakerName());

        if (type.equalsIgnoreCase("surveillance")) {
            factory.createSurveillance().showSpecs();
        } else if (type.equalsIgnoreCase("delivery")) {
            factory.createDelivery().showSpecs();
        } else if (type.equalsIgnoreCase("agricultural")) {
            factory.createAgricultural().showSpecs();
        }
    }

    public static void main(String[] args) {
        // To print a different drone, change the string ("delivery", "surveillance", "agricultural").
        // To print from a different manufacturer, change the factory (ManufacturerAFactory or ManufacturerBFactory).

        printOne(new ManufacturerBFactory(), "surveillance");
    }
}

