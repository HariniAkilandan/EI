package project;

	public class DeviceProxy implements Device {
	    private Device realDevice;

	    public DeviceProxy(Device realDevice) {
	        this.realDevice = realDevice;
	    }

	    public void turnOn() {
	        realDevice.turnOn();
	    }

	    public void turnOff() {
	        realDevice.turnOff();
	    }

	    public String getStatus() {
	        return realDevice.getStatus();
	    }

	    public int getId() {
	        return realDevice.getId();
	    }
	}


