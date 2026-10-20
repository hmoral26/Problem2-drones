// agricultural product. The factory fills in the numbers


public class AgriculturalDrone extends Drone {

    // passes the three specs up to the parent
    public AgriculturalDrone(int battery, int range, String feature) {
        super(battery, range, feature);
    }


    // returns the type name for this drone
    public String getType() {
        return "Agricultural";
    }


}


