package project;
public class ThermostatFactory implements DeviceFactory {
    public Device createDevice(int id) {
        return new Thermostat(id, 70); // default temperature
    }
}

