// Shared drone. Every drone has a battery, a range, and one special feature

// Surveillance, Delivery, and Agricultural extend this
public abstract class Drone {

    protected int battery;   //protected lets the subclasses...
    protected int range;   // (SurveillanceDrone, DeliveryDrone, AgriculturalDrone)..
    protected String feature; // see those fields if they need to
    // private would hide them from the subclasses.


    // constructor sets the three specs that every drone has
    public Drone(int battery, int range, String feature) {

        this.battery = battery;
        this.range = range;
        this.feature = feature;
    }


    // subclasses return their own type name
    public abstract String getType();


    // prints the three specs
    public void showSpecs() {
        System.out.println("Type: " + getType());
        System.out.println("Battery: " + battery + " mAh");
        System.out.println("Range: " + range + " km");
        System.out.println("Feature: " + feature);
    }


}


