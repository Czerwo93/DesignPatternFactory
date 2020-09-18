package cars;

public abstract class Car {

    private final String productionYear;
    private final String engine;
    private final String fuel;
    private final SteeringWheelPosition steeringWheelPosition;

    public Car(String productionYear, String engine, String fuel, SteeringWheelPosition steeringWheelPosition) {
        this.productionYear = productionYear;
        this.engine = engine;
        this.fuel = fuel;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }


}
