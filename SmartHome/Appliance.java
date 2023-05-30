package Pro.Lesson1.SmartHome;
public abstract class Appliance {
    private String name;
    private boolean working;

    public Appliance(String name) {
        this.name = name;
        this.working = false;
    }

    public void turnOn() {
        working = true;
        System.out.println(name + " включен");
    }

    public void turnOff() {
        working = false;
        System.out.println(name + " выключен");
    }

    public boolean isWorking() {
        return working;
    }
}
