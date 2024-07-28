package project;

public class DoorLockFactory implements DeviceFactory {
    public Device createDevice(int id) {
        return new DoorLock(id);
    }
}

