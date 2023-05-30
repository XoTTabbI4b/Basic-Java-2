package Pro.Lesson1.SmartHome;
public abstract class Appliance {
    private String name;
    private boolean working;

    public Appliance(String name) {
        this.name = name;
        this.working = false;
    }

    public void turnOn() {
        if (!working) {
            working = true;
            System.out.println(name + " включен");
        } else {
            System.out.println(name + " уже включен");
        }
    }

    public void turnOff() {
        if (working) {
            working = false;
            System.out.println(name + " выключен");
        } else {
            System.out.println(name + " уже выключен");
        }
    }
