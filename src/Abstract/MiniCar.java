package Abstract;

public class MiniCar extends Car {

    public MiniCar() {
    }

    @Override
    public void setVehicleType() {
        carType="mini";
    }

    @Override
    public void setBaseCost() {
        baseCost=100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance=20;
    }
}
