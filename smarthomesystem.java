package project;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class smarthomesystem {
		    private Map<Integer, Device> devices = new HashMap<>();
		    private List<Schedule> schedules = new ArrayList<>();
		    private List<trigger> triggers = new ArrayList<>();

		    public void addDevice(int id, String type) {
		        DeviceFactory factory = null;
		        switch (type.toLowerCase()) {
		            case "light":
		                factory = new LightFactory();
		                break;
		            case "thermostat":
		                factory = new ThermostatFactory();
		                break;
		            case "door":
		                factory = new DoorLockFactory();
		                break;
		        }
		        if (factory != null) {
		            devices.put(id, new DeviceProxy(factory.createDevice(id)));
		        }
		    }

		    public void removeDevice(int id) {
		        devices.remove(id);
		    }

		    public void turnOn(int id) {
		        Device device = devices.get(id);
		        if (device != null) {
		            device.turnOn();
		        }
		    }

		    public void turnOff(int id) {
		        Device device = devices.get(id);
		        if (device != null) {
		            device.turnOff();
		        }
		    }

		    public void setSchedule(int id, String time, String command) {
		        schedules.add(new Schedule(id, time, command));
		    }

		    public void addTrigger(String condition, String action) {
		        triggers.add(new trigger(condition, action));
		    }

		    public String getStatusReport() {
		        StringBuilder statusReport = new StringBuilder();
		        for (Device device : devices.values()) {
		            statusReport.append(device.getStatus()).append("\n");
		        }
		        return statusReport.toString();
		    }

		    public String getScheduledTasks() {
		        StringBuilder scheduleReport = new StringBuilder();
		        for (Schedule schedule : schedules) {
		            scheduleReport.append("{device: ").append(schedule.getDeviceId())
		                    .append(", time: \"").append(schedule.getTime())
		                    .append("\", command: \"").append(schedule.getCommand()).append("\"}\n");
		        }
		        return scheduleReport.toString();
		    }

		    public String getAutomatedTriggers() {
		        StringBuilder triggerReport = new StringBuilder();
		        for (trigger trigger : triggers) {
		            triggerReport.append("{condition: \"").append(trigger.getCondition())
		                    .append("\", action: \"").append(trigger.getAction()).append("\"}\n");
		        }
		        return triggerReport.toString();
		    }


	}

