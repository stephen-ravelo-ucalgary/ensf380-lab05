package edu.ucalgary.oop;

public class Car {
    private String model;
    private Driver driver;
    private Engine engine;

    public Car(String model, Driver driver, Engine engine) {
        this.model = model;
        this.driver = driver;
        this.engine = engine;
    }

    public Car copy(boolean deepCopy) {
        if (deepCopy) {
            Driver driverCopy = new Driver(driver);
            Engine engineCopy = new Engine(engine);
            Car copy = new Car(model, driverCopy, engineCopy);
            return copy;
        } else {
            return this;
        }
    }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public Driver getDriver() { return driver; }

    public void setDriver(Driver driver) { this.driver = driver; }

    public Engine getEngine() { return engine; }

    public void setEngine(Engine engine) { this.engine = engine; }


}
