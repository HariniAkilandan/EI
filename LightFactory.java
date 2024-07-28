package project;
public class LightFactory implements DeviceFactory {
    public Device createDevice(int id) {
        return new Light(id);
    }
}

