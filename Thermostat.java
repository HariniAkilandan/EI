package project;
public class Thermostat implements Device {
    private int id;
    private int temperature;

    public Thermostat(int id, int temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public void turnOn() {
        // Thermostat-specific on logic
    }

    public void turnOff() {
        // Thermostat-specific off logic
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }

    public int getId() {
        return id;
    }
}

