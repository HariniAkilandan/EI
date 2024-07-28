package project;

public class class1 {

	public static void main(String[] args) {
		        smarthomesystem system = new smarthomesystem();
		        
		        system.addDevice(1, "light");
		        system.addDevice(2, "thermostat");
		        system.addDevice(3, "door");

		        system.turnOn(1);
		        system.setSchedule(2, "06:00", "Turn On");
		        system.addTrigger("temperature > 75", "turnOff(1)");

		        System.out.println(system.getStatusReport());
		        System.out.println(system.getScheduledTasks());
		        System.out.println(system.getAutomatedTriggers());
		    }


	}
