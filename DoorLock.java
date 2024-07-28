package project;
public class DoorLock implements Device {
    private int id;
    private String status;

    public DoorLock(int id) {
        this.id = id;
        this.status = "locked";
    }

    public void turnOn() {
        status = "unlocked";
    }

    public void turnOff() {
        status = "locked";
    }

    public String getStatus() {
        return "Door " + id + " is " + status;
    }

    public int getId() {
        return id;
    }
}

