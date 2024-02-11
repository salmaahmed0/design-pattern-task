package facade;

public class Main {
    public static void main(String[] args) {
        AutomationSystemFacade automationSystem = new AutomationSystemFacade();
        automationSystem.TurnAllDevicesOn();
        automationSystem.TurnAllDevicesOff();
    }
}
