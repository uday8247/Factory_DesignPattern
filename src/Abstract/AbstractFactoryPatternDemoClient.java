package Abstract;

public class AbstractFactoryPatternDemoClient {
    public static void main(String[] args) {
        int distance=10;

        //Book a mini car for 10 kms
        AbstractVehicleFactory carFactory=FactoryProvider.getVehicleFactory("Car");
        Vehicle miniCar=carFactory.getVehicle("Mini");
        miniCar.book(distance);

        //Book a personal Auto for 10kms
        AbstractVehicleFactory autoFactory=FactoryProvider.getVehicleFactory("Auto");
        Vehicle personalAuto=autoFactory.getVehicle("Personal");
        personalAuto.book(distance);

        //Book a sports bike for 10kms
        AbstractVehicleFactory bikeFactory=FactoryProvider.getVehicleFactory("Bike");
        Vehicle sportsBike=bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);
    }
}
