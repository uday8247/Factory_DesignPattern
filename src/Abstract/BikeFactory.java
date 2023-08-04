package Abstract;

public class BikeFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        }else if(type.equalsIgnoreCase("Normal")){
            return new NormalBike();
        }else{
            return new NormalBike();
        }
    }
}
