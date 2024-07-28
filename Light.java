package project;
public class Light implements Device {
    private int id;
    private String status;

    public Light(int id) {
        this.id = id;
        this.status = "off";
    }

    public void turnOn() {
        status = "on";
    }

    public void turnOff() {
        status = "off";
    }

    public String getStatus() {
        return "Light " + id + " is " + status;
    }

    public int getId() {
        return id;
    }
}

