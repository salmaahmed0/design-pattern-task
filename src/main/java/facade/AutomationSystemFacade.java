package facade;

public class AutomationSystemFacade {

    private Light light;
    private AirConditioner ac;
    private TV tv;

    public AutomationSystemFacade(){
        light = new Light();
        ac = new AirConditioner();
        tv = new TV();
    }

    public void TurnAllDevicesOn(){
        System.out.println("All Devices Turning On ...");
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
    }
    public void TurnAllDevicesOff(){
        System.out.println("All Devices Turning Off ...");
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }

}
