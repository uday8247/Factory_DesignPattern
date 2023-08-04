package Abstract;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String type){
        if(type.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if(type.equalsIgnoreCase("Auto")){
            return new AutoFactory();
        }else if(type.equalsIgnoreCase("Bike")){
            return new BikeFactory();
        }else{
            return new CarFactory();
        }
    }
}
